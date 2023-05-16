package readProperties;

import org.junit.Test;
import readProperties.BaseTest;

import java.io.IOException;

public class PropertiesTest extends BaseTest{

    @Test
    public void readProperties() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        String urlFromProperty = System.getProperty("url");
        System.out.println(urlFromProperty);
    }

    @Test
    public void readFromConf(){
        String urlFromConf = ConfigProvider.URL;
        String passwordUser = ConfigProvider.USER_FB_PASSWORD;
        System.out.println(urlFromConf);
        System.out.println(passwordUser);
        //Получение значений в нужном классе через интерфейс ConfigProvider и метод readConfig без создания статичных строк в интерфейсе
        if (ConfigProvider.readConfig().getBoolean("userParams.admin.isAdmin")){
            System.out.println("Админ действительно админ");
        } else {
            System.out.println("Это не админ");
        }
    }
}
