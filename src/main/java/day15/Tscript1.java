package day15;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

    public class Tscript1 extends Base{

        @Test
        public void valid_emicalculator(){

            //enter loan amount
            driver.findElement(By.id("loanamount")).sendKeys("15000");
            driver.findElement(By.id("rate")).sendKeys("20");
            driver.findElement(By.id("pmonths")).sendKeys("10");
            // click the button
            driver.findElement(By.name("Button1")).click();
            //verify emi if matching print pass or fail
            String output=driver.findElement(By.id("EMI")).getAttribute("value");
            System.out.println(output);
            if(output.equals("1321.91"))
            {
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
        }
        @Test
        public void invalid_emicalculator()
        {
            // click on calculate button
            driver.findElement(By.id("Button1")).click();
            // handling alert

            Alert alert=driver.switchTo().alert();
            String alertText=alert.getText();
            if(alertText.equals("please enter loan amount"))
            {
                System.out.println("PASS");
            }
            else {
                System.out.println("FAIL");
            }
            // click on ok button
            alert.accept();

        }
        @Test(dataProvider = "firstDataProvider",dataProviderClass = DataProviders.class)
        public void testData(String amount,String rate){
            System.out.println("---------------");
            System.out.println("----------------");
            System.out.println("----------------");
        }
    }



