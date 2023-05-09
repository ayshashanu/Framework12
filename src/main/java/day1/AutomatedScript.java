package day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomatedScript {
    public static void main(String[] args) {
        //open browser
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);

// launch url
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        driver.manage().window().maximize();
        //Enter the value
       driver.findElement(By.id("loanamount")).sendKeys("15000");
       driver.findElement(By.id("rate")).sendKeys("20");
       driver.findElement(By.id("pmonths")).sendKeys("10");
       // click the button
       driver.findElement(By.id("Button1")).click();
    }
}
