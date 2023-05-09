package day16;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestReports {
    public static void main(String[] args) throws IOException{
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);

        ExtentTest mytest= extent.createTest("My First Test");
        mytest.log(Status.PASS,"Starting the test");

        //open chrome browser
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
//launch url
        driver.navigate().to("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        driver.manage().window().maximize();

        //Enter loan amount
        driver.findElement(By.id("loanamount")).sendKeys("100000");
        mytest.log(Status.PASS,"Entered the amount");

        // Enter interest rate
        driver.findElement(By.name("rate")).sendKeys("10");
        mytest.log(Status.PASS,"Enter the tenure");

        // enter tenure
        driver.findElement(By.id("pmonths")).sendKeys("120");

        // click calculate button
        driver.findElement(By.name("Button1")).click();

        // verify emi-if emi matching print pass else fail
        String output=driver.findElement(By.id("EMI")).getAttribute("value");
        mytest.log(Status.PASS,"The output is"+output);
        System.out.println(output);

        // take screenshot
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File screenshotAs  = screenshot.getScreenshotAs(OutputType.FILE);
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy hh-MM-ss-SSS");
        String format=simpleDateFormat.format(date);
        String filePath=System.getProperty("user.dir")+"/src/main/Screenshots/test"+ format+".png";
        FileUtils.copyFile(screenshotAs,new File(filePath));

        if(output.equals("1321.91")) {
            System.out.println("PASS");
            mytest.log(Status.PASS, "Test is successfully passed");
        }
        else{
            System.out.println("FAIL");
            mytest.log(Status.FAIL,"Test is failed as the expected is 1321.91",
            MediaEntityBuilder.createScreenCaptureFromPath(filePath.replace(System.getProperty("user.dir"),"")).build() );
        }
        driver.quit();
        extent.flush();
    }

}
