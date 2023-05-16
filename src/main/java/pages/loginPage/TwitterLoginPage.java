package pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import static constants.Constant.UserCredentialTwitter.EMAIL_TWITTER;
import static constants.Constant.UserCredentialTwitter.PASSWORD_TWITTER;

public class TwitterLoginPage extends BasePage {


    public TwitterLoginPage(WebDriver driver) {
        super(driver);
    }



    private final By enterEntrance = By.xpath("//a[@data-testid='OAuth_Consent_Log_In_Button']");

    private final By inputEmail = By.xpath("//input[@autocomplete='username']");
    private final By enterEmailFurther = By.xpath("//div[@dir='ltr' and @style='color: rgb(255, 255, 255);']");

    //div[@role='button' and @style='border-color: rgba(0, 0, 0, 0); background-color: rgb(15, 20, 25);']
    private final By passwordInput = By.xpath("//input[@name='password']");
    private final By enterPassword = By.xpath("//div[@data-testid='LoginForm_Login_Button']");

    private final By authoriseApp = By.xpath("//div[@data-testid='OAuth_Consent_Button']");




    public TwitterLoginPage login() throws InterruptedException {
        // Store the current window handle
        //Thread.sleep(2000);
        String winHandleBefore = driver.getWindowHandle();

// Perform the click operation that opens new window

// Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
//Thread.sleep(4000);
        WebElement enterEntranceWebEl = driver.findElement(enterEntrance);
        waitElementIsVisible(enterEntranceWebEl).click();

        //Thread.sleep(4000);
        WebElement inputEmailWebEl = driver.findElement(inputEmail);
        waitElementIsVisible(inputEmailWebEl).sendKeys(EMAIL_TWITTER);
        Thread.sleep(4000);
        driver.findElement(enterEmailFurther).click();

        WebElement inputPasswordWebEl = driver.findElement(passwordInput);
        waitElementIsVisible(inputPasswordWebEl).sendKeys(PASSWORD_TWITTER);
        driver.findElement(enterPassword).click();


        WebElement passwordInputWebEl = driver.findElement(passwordInput);
        waitElementIsVisible(passwordInputWebEl).sendKeys(PASSWORD_TWITTER);
        //driver.findElement(passwordInput).sendKeys(PASSWORD_GOOGLE);
        driver.findElement(enterPassword).click();

        WebElement autoriseAppWebEl = driver.findElement(authoriseApp);
        waitElementIsVisible(autoriseAppWebEl).click();

// Switch back to original browser (first window)
        //driver.switchTo().window(winHandleBefore);
      //  driver.switchTo().defaultContent();
       // Thread.sleep(6000);
        driver.close();
        driver.switchTo().window(winHandleBefore);

        return this;
    }






    //    WebDriver driver = new ChromeDriver();
//    public void login (String login, String pass){
//        loginInput.sendKeys(login);
//        passInput.sendKeys(pass);
//        enter.click();
//    }

}
