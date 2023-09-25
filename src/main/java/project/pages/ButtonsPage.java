package project.pages;

import framework.webElements.Button;
import framework.webElements.DivWithText;
import framework.webElements.Paragraph;
import org.openqa.selenium.By;

public class ButtonsPage extends BaseForm  {
    private static DivWithText text = new DivWithText(By.xpath("//div[@class='main-header' and text()='Buttons']"));
    private static Button clickMe = new Button(By.xpath("//button[text()='Click Me']"));
    private static Button rightClickButton = new Button(By.xpath("//button[@id='rightClickBtn']"));
    private static Button doubleClickButton = new Button(By.xpath("//button[@id='doubleClickBtn']"));
    private static Button alertsFrameAndWindowsButton = new Button(By.xpath("//div[contains(text(),'Alerts')]"));
    private static Button browserWindowsButton = new Button(By.xpath("//span[text()='Browser Windows']"));
    private static Paragraph dynamicClickMessage = new Paragraph(By.xpath("//p[@id='dynamicClickMessage']"));
    private static Paragraph rightClickMessage = new Paragraph(By.cssSelector("#rightClickMessage"));
    private static Paragraph doubleClickMessage = new Paragraph(By.cssSelector("#doubleClickMessage"));

    public ButtonsPage() {
        super(text);
    }

    public void clickClickMeButton() throws Exception {
        clickMe.clickElement();
    }

    public String getDynamicClickMessage() throws Exception {
        return dynamicClickMessage.getText();
    }

    public void clickRightClickButton() throws Exception {
        rightClickButton.rightClickElement();
    }

    public String getRightClickMessage() throws Exception {
        return rightClickMessage.getText();
    }

    public void clickDoubleClickButton() throws Exception {
        doubleClickButton.doubleClickElement();
    }

    public String getDoubleClickMessage() throws Exception {
        return doubleClickMessage.getText();
    }

    public void clickAlertsFrameAndWindowsButton() throws Exception {
        alertsFrameAndWindowsButton.clickElement();
    }

    public void clickBrowserWindowsButton() throws Exception {
        browserWindowsButton.clickElement();
    }

}
