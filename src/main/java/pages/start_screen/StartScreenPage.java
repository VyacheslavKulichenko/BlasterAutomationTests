package pages.start_screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;
import static constants.Constant.UserCredentialBase.EMAIL_BASE;

public class StartScreenPage extends BasePage {
    public StartScreenPage(WebDriver driver) {
        super(driver);
    }

    //WebElement buttonProfile = driver.findElement(By.xpath("//button[contains(@class, 'header-profile')]"));
    private final By buttonProfile = By.xpath("//button[contains(@class, 'header-profile')]");
    private final By userNameFromProfile = By.xpath("//p[contains(@class, 'fw-400')]");
    private final By btnLogoutFromProfile = By.xpath("//a[contains(@class, 'log-out')]");
    private final By btnLogoutEnter = By.xpath("//button[text()='Logout']");



    public StartScreenPage checkProfile() throws InterruptedException {
        WebElement btnProfileWebEl = driver.findElement(buttonProfile);
        waitElementIsVisible(btnProfileWebEl).click();

        //driver.findElement(buttonProfile).click();
        //Thread.sleep(3000);
        WebElement userNameFromProfileWebEl = driver.findElement(buttonProfile);
        //waitElementIsVisible(userNameFromProfileWebEl).click();
        String userNameFromProfileStr = waitElementIsVisible(userNameFromProfileWebEl).findElement(userNameFromProfile).getText();
       // String userNameFromProfile = startScreenPage.getUserNameFromProfile();
        //System.out.println(userNameFromProfile);
        Assert.assertEquals(userNameFromProfileStr, EMAIL_BASE);
        driver.findElement(buttonProfile).click();

        return this;
    }

    public StartScreenPage closeProfile(){
        driver.findElement(buttonProfile).click();
        return this;
    }


//    public String getUserNameFromProfile() {
//        return driver.findElement(userNameFromProfile).getText();
//    }

    public StartScreenPage logoutOfProfile(){
        driver.findElement(buttonProfile).click();
        driver.findElement(btnLogoutFromProfile).click();
        driver.findElement(btnLogoutEnter).click();

        //buttonProfile.cklik;
        return this;
    }
}
