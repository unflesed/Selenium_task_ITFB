import framework.browser.Browser;
import framework.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    @BeforeMethod
    public void getDriver() throws Exception {
        Browser.getDriver();
        Browser.setBrowserConfig();
    }

    @AfterMethod
    public void quit(){
        Driver.quit();
    }
}
