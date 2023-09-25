package framework.driver;

import framework.browserFactory.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Driver {
    private static WebDriver driver = null;

    public static WebDriver getDriver() throws Exception {
        if (driver == null) {
            driver = new BrowserFactory().init().getDriver();
        }
        return driver;
    }

    public static void quit(){
        driver.quit();
        driver = null;
    }
}
