package Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class ExcelReadWrite1
{
    //-----objective-----
//   1.To read the Amount,Interest,Tenure from Excel.
//   2.To Insert the Amount,Interest,Tenure in the Application .
//   3.To Capture EMI from the app and validate against the emi in excel.
//   4.If matching write pass else write fail.

    public static void main(String[] args) throws IOException {
        ExcelRW myxl=new ExcelRW("C:\\Users\\ELCOT\\Documents\\EMI.xlsx");

        //Launch the Emi Application
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);

// launch url
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        driver.manage().window().maximize();

        // Get The RowCount
        int rowCount= myxl.getRowCount("Sheet1");

        for (int iRow=1;iRow<=rowCount;iRow++)
        {
            String amount = myxl.readCellValue("Sheet1", iRow, 0);
            String rate = myxl.readCellValue("Sheet1", iRow, 1);
            String tenure = myxl.readCellValue("Sheet1", iRow, 2);

            //find and do the actions in the element
            driver.findElement(By.id("loanamount")).clear();
            driver.findElement(By.id("loanamount")).sendKeys(amount);

            driver.findElement(By.name("rate")).clear();
            driver.findElement(By.name("rate")).sendKeys(rate);

            driver.findElement(By.id("pmonths")).clear();
            driver.findElement(By.id("pmonths")).sendKeys(tenure);

            // click to calculate
            driver.findElement(By.name("Button1")).click();


            //get the emi value
            String output = driver.findElement(By.id("EMI")).getAttribute("value");

            if (output.equals(myxl.readCellValue("Sheet1", iRow, 3)))
            {
                myxl.writeCellValue("Sheet1", iRow, 4, "PASS");
            } else
            {
                myxl.writeCellValue("Sheet1", iRow, 4, "FAIL");
            }
            System.out.println(output);

            //saving Excel sheet
            myxl.saveAndCloseWorkbook("C:\\Users\\ELCOT\\Documents\\EMI.xlsx");
        }
    }
}






