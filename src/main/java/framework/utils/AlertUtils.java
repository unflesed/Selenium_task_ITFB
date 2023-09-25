package framework.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static framework.browser.Browser.waitInit;

public class AlertUtils {
    public static Alert waitUntilAlertPresented() throws Exception {

        return waitInit().until(ExpectedConditions.alertIsPresent());
    }

}
