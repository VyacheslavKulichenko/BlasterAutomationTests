package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");


        //return ConfigFactory.load("application.conf");
    }
    String URL = readConfig().getString("url");
    Integer AGE = readConfig().getInt("age");
    String ADMIN_LOGIN = readConfig().getString("userParams.admin.login");
    String USER_FB_PASSWORD = readConfig().getString("userParams.userFB.password");
    Boolean IS_USER_FB_ADMIN = readConfig().getBoolean("userParams.userFB.isAdmin");
}
