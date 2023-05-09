package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {


    public WebDriver driver;

    @BeforeMethod
    public void launchApp() {
        //open chrome browser

       // WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
         System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(chromeOptions);
//launch url
        driver.navigate().to("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        driver.manage().window().maximize();
  }

    @AfterMethod
   public void tearDown() {
       driver.quit();
  }
}




