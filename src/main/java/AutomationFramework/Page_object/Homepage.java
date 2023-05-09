package AutomationFramework.Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    public WebDriver driver;

    // elements
    @FindBy(linkText = "Sign In")
    public WebElement lnk_Signin;

    @FindBy(id="username")
    public WebElement lbl_ValidLogin;

    // constructor
    public Homepage(WebDriver wdriver){
        driver=wdriver;
        PageFactory.initElements(driver,this);
    }

    //Actions
    public void click_SignIn(){
        lnk_Signin.click();
    }
    public boolean isSucessfulMessageDisplyed(){
        return lbl_ValidLogin.isDisplayed();
    }
}
