package tests.base;

import common.CommonAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.loginPage.BaseLoginPage;
import pages.loginPage.GoogleLoginPage;
import pages.loginPage.TwitterLoginPage;
import pages.loginPage.ZoomLoginPage;
import pages.start_screen.StartScreenPage;
import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROUSER_OPEN;

public class BaseTest {

    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected BaseLoginPage baseLoginPage = new BaseLoginPage(driver);
    protected StartScreenPage startScreenPage = new StartScreenPage(driver);
    protected GoogleLoginPage googleLoginPage = new GoogleLoginPage(driver);
    protected ZoomLoginPage zoomLoginPage = new ZoomLoginPage(driver);
    protected TwitterLoginPage twitterLoginPage = new TwitterLoginPage(driver);

    @AfterTest
    public void clearCookiesAndLocalStorage() {
    if (CLEAR_COOKIES_AND_STORAGE) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.manage().deleteAllCookies();
        javascriptExecutor.executeScript("window.sessionStorage.clear()");

    }
}
    @AfterSuite (alwaysRun = true)
    public void close() {
        if (HOLD_BROUSER_OPEN) {
            driver.quit();
        }
    }
}
