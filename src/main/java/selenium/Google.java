package selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {

       // WebDriverManager.edgedriver().setup();
        System.setProperty("webdriver.edge.driver","C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\edge\\edgedriver_win64 (1)\\msedgedriver.exe");
       WebDriver driver=new EdgeDriver();
      //  ChromeOptions chromeOptions=new ChromeOptions();
       // chromeOptions.addArguments("--remote-allow-origins=*");
       // /System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\drivers\\chromedriver_win32\\chromedriver.exe");
       // ChromeDriver driver=new ChromeDriver();

        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");

        driver.manage().window().maximize();
        Thread.sleep(10000);
    }
}
