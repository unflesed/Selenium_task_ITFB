package project.pages;

import framework.webElements.Button;
import framework.webElements.DivWithText;
import org.openqa.selenium.By;

public class BrowserWindowsPage extends BaseForm{
    private static DivWithText text = new DivWithText(By.xpath("//div[@class='main-header' and text()='Browser Windows']"));
    private static Button newTabButton = new Button(By.xpath("//button[@id='tabButton']"));
    private static Button newWindowButton = new Button(By.xpath("//button[@id='windowButton']"));
    private static Button alertsButton = new Button(By.xpath("//span[text()='Alerts']"));

    public BrowserWindowsPage() {
        super(text);
    }

    public void clickNewTabButton() throws Exception {
        newTabButton.clickElement();
    }

    public void clickNewWindowButton() throws Exception {
        newWindowButton.clickElement();
    }

    public void clickAlertsButton() throws Exception {
        alertsButton.clickElement();
    }
}
