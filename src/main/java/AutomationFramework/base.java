package AutomationFramework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class base {
    public WebDriver driver;

    public static ExtentReports extent;

    public ExtentTest mytest;


    /**
     * intialize the reports
     */

    @BeforeSuite(groups = {"Smoke","Reg","Prod","Dev"})
    public void init_report(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
    }

    /**
     * launch the application
     */
    @Parameters("browser")

    @BeforeMethod(groups = {"Smoke","Reg","Prod","Dev"})
    public void launchApp(String browser){

        switch(browser){

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;

            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(chromeOptions);
                break;
        }

//l open chrome browser
        driver.navigate().to("https://books.rediff.com/");
        driver.manage().window().maximize();
    }

    /**
     * to close the applocation
     */

    @AfterMethod(groups = {"Smoke","Reg","Prod","Dev"})
    public void tearDown(ITestResult result) throws IOException{
        if(result.getStatus()==ITestResult.FAILURE){
            mytest.log(Status.FAIL,"Error occurs with Exception"+result.getThrowable(),
                    MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot().replace(System.getProperty("user.dir"),"")).build() );
        }
        extent.flush();
        driver.close();
    }
    /**
     *to create  screenshot and get the file path
     * @return: screenshot file path
     * @throws IOException
     */

    public String getScreenshot() throws IOException {
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File screenshotAs  = screenshot.getScreenshotAs(OutputType.FILE);
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy hh-MM-ss-SSS");
        String format=simpleDateFormat.format(date);
        String filePath=System.getProperty("user.dir")+"/src/main/Screenshots/test"+ format+".png";
        FileUtils.copyFile(screenshotAs,new File(filePath));

           return filePath;

    }


}
