package framework.browser;

import framework.driver.Driver;
import framework.parsers.ConfigParser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    private final String ORIGINAL_WINDOW = Driver.getDriver().getWindowHandle();

    public Browser() throws Exception {
    }

    public static WebDriver getDriver() throws Exception {
        return Driver.getDriver();
    }

    public static void setBrowserConfig() throws Exception {
        Driver.getDriver().manage().window().maximize();
    }

    public void getURL() throws Exception {
        Driver.getDriver().get(ConfigParser.getUrlName());
    }

    public void scrollPage() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }

    public void switchToNewTabWindow() throws Exception {
        for (String wh : Driver.getDriver().getWindowHandles()) {
            if(!ORIGINAL_WINDOW.contentEquals(wh)) {
                Driver.getDriver().switchTo().window(wh);
                break;
            }
        }
    }

    public void switchToOriginalTabWindow() throws Exception {
        Driver.getDriver().switchTo().window(ORIGINAL_WINDOW);
    }

    public void closeTabWindow() throws Exception {
        Driver.getDriver().close();
    }

    public static WebDriverWait waitInit() throws Exception {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(ConfigParser.getTimeout()));
    }
}
