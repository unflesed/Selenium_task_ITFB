package framework.browserFactory;

import framework.parsers.ConfigParser;

public class BrowserFactory {
    public IWebDriver init() throws Exception {
        switch(ConfigParser.getBrowserName()){
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            default:
                break;
        }
        return null;
    }
}
