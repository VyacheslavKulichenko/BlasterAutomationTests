package readProperties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    @Test
    public void testInit() {
        //альтернативный способ инициализации драйвера
        //System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//        WebElement serchBox = driver.findElement(By.name("q"));
//        serchBox.sendKeys("ChromeDriver");
//        serchBox.submit();
//        driver.quit();
    }
}
