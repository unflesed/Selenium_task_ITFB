package project.pages;

import framework.webElements.*;
import org.openqa.selenium.By;

public class TextBoxPage extends BaseForm{
    private static DivWithText text = new DivWithText(By.xpath("//div[@class='main-header' and text()='Text Box']"));
    private static Input userNameInput = new Input(By.cssSelector("#userName"));
    private static Input userEmailInput = new Input(By.cssSelector("#userEmail"));
    private static TextArea currentAddressTextArea = new TextArea(By.xpath("//textarea[@id='currentAddress']"));
    private static TextArea permanentAddressTextArea = new TextArea(By.xpath("//textarea[@id='permanentAddress']"));
    private static Paragraph userName = new Paragraph(By.xpath("//p[@id='name']"));
    private static Paragraph userEmail = new Paragraph(By.xpath("//p[@id='email']"));
    private static Paragraph currentAddress = new Paragraph(By.xpath("//p[@id='currentAddress']"));
    private static Paragraph permanentAddress = new Paragraph(By.xpath("//p[@id='permanentAddress']"));
    private static Button submitButton = new Button(By.xpath("//button[@id='submit']"));
    private static Button buttons = new Button(By.xpath("//span[text()='Buttons']"));

    public TextBoxPage() {
        super(text);
    }

    public void sendUserName(String userName) throws Exception {
        userNameInput.sendText(userName);
    }

    public void sendUserEmail(String userEmail) throws Exception {
        userEmailInput.sendText(userEmail);
    }

    public void sendCurrentAddress(String currentAddress) throws Exception {
        currentAddressTextArea.sendText(currentAddress);
    }

    public void sendPermanentAddress(String permanentAddress) throws Exception {
        permanentAddressTextArea.sendText(permanentAddress);
    }

    public void clickSubmitButton() throws Exception {
        submitButton.clickElement();
    }

    public String getUserName() throws Exception {
        return userName.getText();
    }

    public String getUserEmail() throws Exception {
        return userEmail.getText();
    }

    public String getCurrentAddress() throws Exception {
        return currentAddress.getText();
    }

    public String getPermanentAddress() throws Exception {
        return permanentAddress.getText();
    }

    public void clickButtons() throws Exception {
        buttons.clickElement();
    }
}
