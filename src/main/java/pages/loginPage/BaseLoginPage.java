package pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import static constants.Constant.UserCredentialBase.EMAIL_BASE;
import static constants.Constant.UserCredentialBase.PASSWORD_BASE;

public class BaseLoginPage extends BasePage {


    public BaseLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By loginInput = By.xpath("//input[@name='user-name']");
    private final By passInput = By.xpath("//input[@name='password']");
    private final By enter = By.xpath("//button[contains(text(), 'Sign In')]");
    private final By btnLoginFB = By.xpath("//button[3]");
    private final By btnLoginViaGoogle = By.xpath("//div[contains(@class, 'auth-panel__socials')]/button/img[contains(@src, 'google-icon')]");
    private final By btnLoginViaZoom = By.xpath("//div[contains(@class, 'auth-panel__socials')]/button/img[contains(@src, 'zoom-icon')]");
    private final By btnLoginViaTwitter = By.xpath("//div[contains(@class, 'auth-panel__socials')]/button/img[contains(@src, 'twitter-icon')]");


//    WebElement loginInput = driver.findElement(By.xpath("//input[@name='user-name']"));
//    WebElement passInput = driver.findElement(By.xpath("//input[@name='password']"));
//    WebElement enter = driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]"));

    public BaseLoginPage baseLogin(){
        driver.findElement(loginInput).sendKeys(EMAIL_BASE);
        driver.findElement(passInput).sendKeys(PASSWORD_BASE);
        driver.findElement(enter).click();


        //loginInput.sendKeys("v.kulichenko@newlinetechnologies.net");
        //passInput.sendKeys("Password*123");
       // enter.click();
        return this;
    }

    public BaseLoginPage googleLogin() throws InterruptedException {

        WebElement btnLoginGoogle = driver.findElement(btnLoginViaGoogle);
        waitElementIsVisible(btnLoginGoogle).click();
//        WebElement webELbtnLoginViaGoogle = driver.findElement(btnLoginViaGoogle);
//                new WebDriverWait(driver, 10, 1000)
//                .until(ExpectedConditions.presenceOfElementLocated(btnLoginViaGoogle));
//        Thread.sleep(5000);
//        webELbtnLoginViaGoogle.click();
       // driver.findElement(btnLoginViaGoogle).click();

        //loginInput.sendKeys("v.kulichenko@newlinetechnologies.net");
        //passInput.sendKeys("Password*123");
        // enter.click();
        return this;
    }

    public BaseLoginPage twitterLogin() throws InterruptedException {
        WebElement btnLoginTwitter = driver.findElement(btnLoginViaTwitter);
        waitElementIsVisible(btnLoginTwitter).click();
        return this;
    }

    public BaseLoginPage zoomLogin(){
        WebElement btnLoginZoom = driver.findElement(btnLoginViaZoom);
        waitElementIsVisible(btnLoginZoom).click();

        //driver.findElement(btnLoginViaZoom).click();

        //loginInput.sendKeys("v.kulichenko@newlinetechnologies.net");
        //passInput.sendKeys("Password*123");
        // enter.click();
        return this;
    }

    public BaseLoginPage FBlogin(){
        driver.findElement(btnLoginFB).click();
        return this;
    }




    //    WebDriver driver = new ChromeDriver();
//    public void login (String login, String pass){
//        loginInput.sendKeys(login);
//        passInput.sendKeys(pass);
//        enter.click();
//    }

}
