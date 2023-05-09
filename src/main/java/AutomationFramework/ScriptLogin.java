package AutomationFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ScriptLogin  extends base{

        @Test(dataProvider="validLogin",dataProviderClass=Dp_login.class)
        public  void  Valid_Login(String TC_ID,String scriptname,String username,String password) {


            // click on sign in button
            driver.findElement(By.linkText("Sign In")).click();

            //click on login details
            driver.findElement(By.name("logid")).sendKeys(username);
            driver.findElement(By.name("pswd")).sendKeys(password);
            driver.findElement(By.xpath("//input[@value='Login']")).click();

            boolean login_username=driver.findElement(By.id("username")).isDisplayed();
            if(login_username){
                System.out.println(TC_ID+"has succcesfully passes");
            }
            else{
                System.out.println(TC_ID+"has failed");
            }

        }
        @Test(dataProvider="invalidLogin",dataProviderClass=Dp_login.class)
        public void Invalid_Login(String TC_ID,String scriptname,String username,String password){
            // click on sign in button
            driver.findElement(By.linkText("Sign In")).click();

            //click on login details
            driver.findElement(By.name("logid")).sendKeys(username);
            driver.findElement(By.name("pswd")).sendKeys(password);
            driver.findElement(By.xpath("//input[@value='Login']")).click();

            boolean displayed=driver.findElement(By.xpath("//b[text()='Sorry we were unable to complete this step because :']")).isDisplayed();

            if(displayed){
                System.out.println(TC_ID+"has succcesfully passes");
            }
            else{
                System.out.println(TC_ID+"has failed");
            }

        }
    }



