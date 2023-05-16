package pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class FBLoginPage extends BasePage {


    public FBLoginPage(WebDriver driver) {
        super(driver);
    }



    private final By emailInput = By.xpath("//input[@id='email']");
    private final By passInput = By.xpath("//input[@id='pass']");
    private final By enter = By.xpath("//button[@id='loginbutton']");




    public FBLoginPage login(){
        driver.findElement(emailInput).sendKeys("v.kulichenko@newlinetechnologies.net");
        driver.findElement(passInput).sendKeys("Password*123");
        driver.findElement(enter).click();

        return this;
    }




    //    WebDriver driver = new ChromeDriver();
//    public void login (String login, String pass){
//        loginInput.sendKeys(login);
//        passInput.sendKeys(pass);
//        enter.click();
//    }

}
