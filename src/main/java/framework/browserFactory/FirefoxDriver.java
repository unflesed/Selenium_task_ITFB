package framework.browserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class FirefoxDriver implements IWebDriver{
    @Override
    public WebDriver getDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new org.openqa.selenium.firefox.FirefoxDriver();
    }
}
