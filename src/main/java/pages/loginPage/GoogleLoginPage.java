package pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.util.List;
import java.util.Set;

import static constants.Constant.UserCredentialGoogle.EMAIL_GOOGLE;
import static constants.Constant.UserCredentialGoogle.PASSWORD_GOOGLE;

public class GoogleLoginPage extends BasePage {


    public GoogleLoginPage(WebDriver driver) {
        super(driver);
    }



    private final By emailInput = By.xpath("//input[@id='identifierId']");
    private final By redirectCinamaker = By.xpath("//button[1]");
    private final By memoreEmail = By.xpath(" //button[text()='Забыли адрес электронной почты?']");
    private final By enterEmail = By.xpath("//div[@id='identifierNext']//button");

    private final By passwordInput = By.xpath("//input[@name='Passwd']");
    private final By enterPassword = By.xpath("//div[@id='passwordNext']//button");


    //button[text()='Забыли адрес электронной почты?']

    //private final By passInput = By.xpath("//input[@id='pass']");
    //private final By enter = By.xpath("//button[@jsname='LgbsSe']");




    public GoogleLoginPage login() throws InterruptedException {

        String parentWindow = driver.getWindowHandle();
        Set<String> handles =  driver.getWindowHandles();
        for(String windowHandle  : handles)
        {
            if(!windowHandle.equals(parentWindow))
            {
                driver.switchTo().window(windowHandle);
                Thread.sleep(10000);
                WebElement emailInputWebEl = driver.findElement(emailInput);
                waitElementIsVisible(emailInputWebEl).sendKeys(EMAIL_GOOGLE);
                driver.findElement(enterEmail).click();
                WebElement passwordInputWebEl = driver.findElement(passwordInput);
                waitElementIsVisible(passwordInputWebEl).sendKeys(PASSWORD_GOOGLE);
                driver.findElement(enterPassword).click();

            }
        }

        String parentHandle = driver.getWindowHandle(); // Save parent window

        WebDriverWait wait = new WebDriverWait(driver, 10); // Timeout in 10s
        boolean isChildWindowOpen = wait.until(ExpectedConditions.numberOfWindowsToBe(1));
        if (isChildWindowOpen) {
            Set<String> handles2 = driver.getWindowHandles();
            // Switch to child window
            for (String handle : handles2) {
                driver.switchTo().window(handle);
                if (!parentHandle.equals(handle)) {
                    break;
                }
            }
            driver.manage().window().maximize();
        }







//        String parentWindow2 = driver.getWindowHandle();
//        Set<String> handles2 =  driver.getWindowHandles();
//        for(String windowHandle  : handles2) {
//            if (!windowHandle.equals(parentWindow2)) {
//
//            }
//        }


//        Thread.sleep(8000);
//        Set<String> allWindows = driver.getWindowHandles();
//        for(String curWindow : allWindows){
//            driver.switchTo().window(curWindow);
//        }
        return this;
    }



    // driver.switchTo().defaultContent();
//        driver.close();
//        driver.switchTo().window(curWindow);
//                winHandleBefore);

//                driver.close(); //closing child window
//                driver.switchTo().window(parentWindow); //cntrl to parent window



    //    WebDriver driver = new ChromeDriver();
//    public void login (String login, String pass){
//        loginInput.sendKeys(login);
//        passInput.sendKeys(pass);
//        enter.click();
//    }

}
