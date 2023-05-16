package pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.util.Set;

import static constants.Constant.UserCredentialZoom.EMAIL_ZOOM;
import static constants.Constant.UserCredentialZoom.PASSWORD_ZOOM;

public class ZoomLoginPage extends BasePage {


    public ZoomLoginPage(WebDriver driver) {
        super(driver);
    }



    private final By emailInput = By.xpath("//input[@id='email']");
    private final By passwordInput = By.xpath("//input[@id='password']");
    private final By enter = By.xpath("//button[@id='js_btn_login']");

//    private final By passwordInput = By.xpath("//input[@name='Passwd']");
//    private final By enterPassword = By.xpath("//div[@id='passwordNext']//button");


    //button[text()='Забыли адрес электронной почты?']

    //private final By passInput = By.xpath("//input[@id='pass']");
    //private final By enter = By.xpath("//button[@jsname='LgbsSe']");




    public ZoomLoginPage loginZoom() throws InterruptedException {

        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
                driver.findElement(emailInput).sendKeys(EMAIL_ZOOM);
                driver.findElement(passwordInput).sendKeys(PASSWORD_ZOOM);
                driver.findElement(enter).click();
//        String parentWindow = driver.getWindowHandle();
//        Set<String> handles =  driver.getWindowHandles();
//        for(String windowHandle  : handles) {
//            if (!windowHandle.equals(parentWindow)) {
//
//                driver.findElement(emailInput).sendKeys(EMAIL_ZOOM);
//                driver.findElement(passwordInput).sendKeys(PASSWORD_ZOOM);
//                driver.findElement(enter).click();
//            }
//        }

        String parentHandle = driver.getWindowHandle(); // Save parent window

        WebDriverWait wait = new WebDriverWait(driver, 20); // Timeout in 10s
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

        // Close the new window, if that window no more required
        //driver.close();

        // Switch back to original browser (first window)
        //driver.switchTo().window(winHandleBefore);
        //driver.switchTo().defaultContent();
//        driver.close();
//        driver.switchTo().window(winHandleBefore);

        return this;
    }




}
