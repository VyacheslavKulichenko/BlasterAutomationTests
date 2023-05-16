package tests.auth;

import org.junit.Test;
import org.testng.Assert;
import tests.base.BaseTest;

import static constants.Constant.Urls.HOME_LOGIN_PAGE;

public class AuthTest extends BaseTest {


    @Test
    public void baseAuth() throws InterruptedException {
        basePage.open(HOME_LOGIN_PAGE);

        baseLoginPage.baseLogin();
        startScreenPage.checkProfile();
        startScreenPage.logoutOfProfile();
        driver.close();

//        baseLoginPage.googleLogin();
//        googleLoginPage.login();
//        Thread.sleep(5000);
//        startScreenPage.checkProfile();
//        startScreenPage.logoutOfProfile();

//        baseLoginPage.twitterLogin();
//        twitterLoginPage.login();
//        startScreenPage.checkProfile();
//        startScreenPage.logoutOfProfile();

//        baseLoginPage.zoomLogin();
//       // Thread.sleep(10000);
//        zoomLoginPage.loginZoom();
//        startScreenPage.checkProfile();
//        startScreenPage.logoutOfProfile();
       // String userNameFromProfile = startScreenPage.getUserNameFromProfile();
        //System.out.println(userNameFromProfile);
        //Assert.assertEquals(userNameFromProfile, "v.kulichenko@newlinetechnologies.net");

    }

    @Test
    public void loginGoogle() throws InterruptedException {
        basePage.open(HOME_LOGIN_PAGE);
        baseLoginPage.googleLogin();
        googleLoginPage.login();
        //Thread.sleep(5000);
        startScreenPage.checkProfile();
        startScreenPage.logoutOfProfile();
        driver.close();

    }

    @Test
    public void loginTwitter() throws InterruptedException {
        basePage.open(HOME_LOGIN_PAGE);
        baseLoginPage.twitterLogin();
        twitterLoginPage.login();
        startScreenPage.checkProfile();
        startScreenPage.logoutOfProfile();
        driver.close();

    }
    @Test
    public void loginZoom() throws InterruptedException {
        basePage.open(HOME_LOGIN_PAGE);
        baseLoginPage.zoomLogin();
         //Thread.sleep(10000);
        zoomLoginPage.loginZoom();
        startScreenPage.checkProfile();
        startScreenPage.logoutOfProfile();
        driver.close();

    }

//    @Test
//    public void checkIsRedirectGoogle() throws InterruptedException {
//        basePage.open(HOME_LOGIN_PAGE);
//
//        baseLoginPage.googleLogin();
//
//
//        // Store the current window handle
//        String winHandleBefore = driver.getWindowHandle();
//
//// Perform the click operation that opens new window
//
//// Switch to new window opened
//        for(String winHandle : driver.getWindowHandles()){
//            driver.switchTo().window(winHandle);
//        }
//
//// Perform the actions on new window
//        googleLoginPage.login();
//
//// Close the new window, if that window no more required
//        //driver.close();
//
//// Switch back to original browser (first window)
//        //driver.switchTo().window(winHandleBefore);
//        driver.switchTo().defaultContent();
//        Thread.sleep(6000);
//        driver.switchTo().window(winHandleBefore);
//
//// Continue with original browser (first window)
//
//       // Thread.sleep(3000);
//        startScreenPage.checkProfile();
//        String userNameFromProfile = startScreenPage.getUserNameFromProfile();
//        //System.out.println(userNameFromProfile);
//        Assert.assertEquals(userNameFromProfile, "v.kulichenko@newlinetechnologies.net");
//
//    }
}
