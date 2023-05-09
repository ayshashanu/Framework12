package AutomationFramework.Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
    public WebDriver driver;


    //element
    @FindBy(name = "logid")
    public WebElement txt_username;

    @FindBy(name = "pswd")
    public WebElement txt_password;

    @FindBy(xpath ="//input[@value='Login']")
    public WebElement btn_login;

    @FindBy(xpath = "//b[text()='Sorry we were unable to complete this step because :']")
    public WebElement lbl_loginErrormsg;

    //constructor
    public SignIn(WebDriver wdriver){
        driver=wdriver;
        PageFactory.initElements(driver,this);
    }

    //action
    public void enterUserDetails(String username,String password){
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
        btn_login.click();
    }
    public boolean isErrorMessageDisplayed(){
        return lbl_loginErrormsg.isDisplayed();
    }



}
