package day13;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Waits {
    public static void main(String[] args) throws InterruptedException, IOException {
        // open the browser
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);

        // launch url
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        //maximize the window
        driver.manage().window().maximize();
        //Implicit wait
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //Fluent wait
       // Thread.sleep(3000);

      //Explicit Wait
       // WebDriverWait wait=new WebDriverWait(driver,(20));
       // WebElement loanamount=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loanamount")));

    // Screenshot in Date format
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy hh-MM-ss-SSS");
        String format= simpleDateFormat.format(date);

     //Take screenhot
        TakesScreenshot screenshot1=(TakesScreenshot) driver;
        File screenshotAs1=screenshot1.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotAs1,new File("C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\screenshots\\first.png"));

        //Enter the value
        driver.findElement(By.id("loanamount")).sendKeys("15000");
        driver.findElement(By.id("rate")).sendKeys("20");
        driver.findElement(By.id("pmonths")).sendKeys("10");

        // click the button
        driver.findElement(By.id("Button1")).click();

       // Screenshot in date format
        date=new Date();
        simpleDateFormat=new SimpleDateFormat("dd-MM-yy hh-MM-ss-SSS");
        format= simpleDateFormat.format(date);

        //Take screenshot
        TakesScreenshot screenshot2=(TakesScreenshot) driver;
        File screenshotAs2=screenshot2.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotAs2,new File("C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\screenshots\\second.png"));

        //clicking on the link bank holidays
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div/div[5]/a")).click();

       // Screenshot in Date format
         date=new Date();
         simpleDateFormat=new SimpleDateFormat("dd-MM-yy hh-MM-ss-SSS");
         format= simpleDateFormat.format(date);

        //Take screenhot
        TakesScreenshot screenshot3=(TakesScreenshot) driver;
        File screenshotAs3=screenshot3.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotAs3,new File("C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\screenshots\\third.png"));

        //close the browser
        driver.quit();
    }
}
