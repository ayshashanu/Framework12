package AutomationFramework;

import AutomationFramework.Page_object.Homepage;
import AutomationFramework.Page_object.SignIn;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScriptLogin_New extends base {
    @Test(dataProvider = "validLogin",dataProviderClass = Dp_login.class,groups={"Smoke","Reg"})
public void valid_Login(String TC_ID,String scriptname,String username,String password) throws IOException {
    Homepage homepage=new Homepage(driver);
    SignIn signIn=new SignIn(driver);

    mytest=extent.createTest(TC_ID);
        Assert.assertTrue(driver.getTitle().contains("Buy Books Online"),"Title  of the Application is not matched");



        // click on sign in
         homepage.click_SignIn();
        mytest.log(Status.PASS,"Successfully launched Application");

        // enter login details
         signIn.enterUserDetails(username,password);
         mytest.log(Status.PASS,"Successfully entered login user details");

    boolean login_username= homepage.isSucessfulMessageDisplyed();
     //    if(login_username){
       // System.out.println(TC_ID+"has succcesfully passes");
  //      mytest.log(Status.PASS, "Test is successfully passed");

    //}
      //      else{
        //System.out.println(TC_ID+"has failed");
          //   mytest.log(Status.FAIL,"Test is failed as the expected is 1321.91",
// MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot().replace(System.getProperty("user.dir"),"")).build() );
        // }
        Assert.assertTrue(login_username,"user not successfully signed in");
        mytest.log(Status.PASS,TC_ID+"has successfully passed");
    }







     @Test(dataProvider = "invalidLogin",dataProviderClass = Dp_login.class,groups={"Reg","Prod","Dev"})
        public void invalid_Login(String TC_ID,String scriptname,String username,String password) throws IOException {
         Homepage homepage=new Homepage(driver);
          SignIn signIn=new SignIn(driver);

          mytest=extent.createTest(TC_ID);
         Assert.assertTrue(driver.getTitle().contains("Buy Books Online"), "Title of the application is not matched");

          // click on sign in
          homepage.click_SignIn();
          mytest.log(Status.PASS,"Successfully launched Application");


          // enter login details
          signIn.enterUserDetails(username,password);
          mytest.log(Status.PASS,"Successfully entered login user details");


          boolean displayed=signIn.isErrorMessageDisplayed();
        //  if(displayed){
          //    System.out.println(TC_ID+"has succcesfully passes");
            //  mytest.log(Status.PASS, "Test is successfully passed");

          //}
          //else{
            //  System.out.println(TC_ID+"has failed");mytest.log(Status.FAIL,"Test is failed as the expected is 1321.91",
        // MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot().replace(System.getProperty("user.dir"),"")).build() );
        //  }
      Assert.assertTrue(displayed,"Error Message not displayed");
      mytest.log(Status.PASS,TC_ID+"has successfully passed");

          }
          }







