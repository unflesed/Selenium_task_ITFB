package framework.webElements.alerts;

import framework.driver.Driver;
import framework.utils.AlertUtils;
import org.openqa.selenium.Alert;

public class Alerts {
    public String getAlertText() throws Exception {
        Alert alert = Driver.getDriver().switchTo().alert();
        return alert.getText();
    }

    public boolean alertIsPresented() {
        try{
            Driver.getDriver().switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void alertAccept() throws Exception {
        Driver.getDriver().switchTo().alert().accept();
    }

    public Alert waitAlert() throws Exception {
       return AlertUtils.waitUntilAlertPresented();
    }

    public void alertSendText(String text) throws Exception {
        Driver.getDriver().switchTo().alert().sendKeys(text);
    }
}
