package project.pages;

import framework.webElements.Button;
import framework.webElements.DivWithText;
import framework.webElements.Span;
import org.openqa.selenium.By;

public class AlertsPage extends BaseForm{
    private static DivWithText text = new DivWithText(By.xpath("//div[@class='main-header' and text()='Alerts']"));
    private static Button clickButtonToSeeAlert = new Button(By.xpath("//button[@id='alertButton']"));
    private static Button clickButtonToSeeAlertWithWaiting = new Button(By.xpath("//button[@id='timerAlertButton']"));
    private static Button clickBtnToSeePromptAlert = new Button(By.xpath("//button[@id='promtButton']"));
    private static Button clickConfirmButton = new Button(By.xpath("//button[@id='confirmButton']"));
    private static Span resultTextConfirm = new Span(By.cssSelector("#confirmResult"));
    private static Span resultTextPrompt = new Span(By.cssSelector("#promptResult"));


    public AlertsPage() {
        super(text);
    }

    public void clickButtonToSeeAlert() throws Exception {
        clickButtonToSeeAlert.clickElement();
    }

    public void clickButtonToSeeAlertWithWaiting() throws Exception {
        clickButtonToSeeAlertWithWaiting.clickElement();
    }

    public void clickButtonToSeePromptAlert() throws Exception {
        clickBtnToSeePromptAlert.clickElement();
    }

    public void clickButtonConfirmBoxAlert() throws Exception {
        clickConfirmButton.clickElement();
    }

    public String getConfirmResultText() throws Exception {
        return resultTextConfirm.getText();
    }

    public String getResultPromptText() throws Exception {
        return resultTextPrompt.getText();
    }
}
