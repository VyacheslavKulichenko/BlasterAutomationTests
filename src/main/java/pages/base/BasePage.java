package pages.base;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver){

        this.driver = driver;

    }



    public void open (String url){
        driver.get(url);
    }

    public WebElement waitElementIsVisible (WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        //new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));

        return element;
    }

//    public WebElement waitElementIsVisible2 (WebElement element){
//
//        //WebElement webELbtnLoginViaGoogle = driver.findElement(btnLoginViaGoogle);
//        new WebDriverWait(driver, 10, 1000)
//                .until(ExpectedConditions.presenceOfElementLocated(btnLoginViaGoogle));
//
//        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
////        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
//
//        return element;
//    }

//    @Test
//    public void testInit() {
        //альтернативный способ инициализации драйвера
        //System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");

       // WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//        WebElement serchBox = driver.findElement(By.name("q"));
//        serchBox.sendKeys("ChromeDriver");
//        serchBox.submit();
//        driver.quit();
//    }
}
