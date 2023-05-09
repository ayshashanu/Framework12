package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Asserts {
    public static void main(String[] args) throws InterruptedException {
        //open browser
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);

// launch url
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        driver.manage().window().maximize();

        //verify application title
        if(driver.getTitle().contains("Union Bank of India")) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        Assert.assertTrue(driver.getTitle().contains("Union Bank of India"), "Title is not matching");

        //Enter the value
        driver.findElement(By.id("loanamount")).sendKeys("15000");
        driver.findElement(By.id("rate")).sendKeys("20");
        driver.findElement(By.id("pmonths")).sendKeys("10");
        // click the button
        driver.findElement(By.id("Button1")).click();

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

        Assert.assertEquals(output,"1321.91","Emi is not matching");
        driver.quit();

}


    }
