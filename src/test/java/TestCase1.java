import framework.browser.Browser;
import framework.parsers.TestingDataParser;
import framework.utils.Strings;
import framework.webElements.alerts.Alerts;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.*;

@Feature(value = "Testing tasks")
public class TestCase1 extends BaseTest{
    private static final String DYNAMIC_CLICK_MESSAGE = "You have done a dynamic click";
    private static final String RIGHT_CLICK_MESSAGE = "You have done a right click";
    private static final String DOUBLE_CLICK_MESSAGE = "You have done a double click";
    private static final String ALERT_MESSAGE = "You clicked a button";
    private static final String ALERT_WITH_WAITING_MESSAGE = "This alert appeared after 5 seconds";
    private static final String CONFIRM_ALERT_MESSAGE = "Do you confirm action?";
    private static final String PROMPT_ALERT_MESSAGE = "Please enter your name";
    private static final String CONFIRM_RESULT_MESSAGE = "You selected Ok";
    private static final String PROMPT_RESULT_MESSAGE = "You entered %s";

    @Issue(value = "Task 2")
    @Link(name = "Testing resource", url = "https://demoqa.com/")
    @Owner(value = "Anatoliy Morozov")
    @Description("Input fields filling, clicking the buttons, window handling and alerts")
    @Test
    public void testCase() throws Exception {
        MainPage mainPage = new MainPage();
        Browser browser = new Browser();
        ElementsPage elementsPage = new ElementsPage();
        TextBoxPage textBoxPage = new TextBoxPage();
        ButtonsPage buttonsPage = new ButtonsPage();
        BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage();
        AlertsPage alertsPage = new AlertsPage();
        Alerts alert = new Alerts();

        browser.getURL();

        Assert.assertTrue(mainPage.isOpened(),"Main page is not opened");

        browser.scrollPage();
        mainPage.clickElementsButton();

        Assert.assertTrue(elementsPage.isOpened(),"Elements page is not opened");

        elementsPage.clickTextBoxButton();

        Assert.assertTrue(textBoxPage.isOpened(),"Text Box page is not opened");

        textBoxPage.sendUserName(TestingDataParser.getName());
        textBoxPage.sendUserEmail(TestingDataParser.getEmail());
        textBoxPage.sendCurrentAddress(TestingDataParser.getCurrentAddress());
        textBoxPage.sendPermanentAddress(TestingDataParser.getPermanentAddress());
        textBoxPage.clickSubmitButton();

        Assert.assertEquals(Strings.getTextAfterColon(textBoxPage.getUserName()), TestingDataParser.getName(), "Text doesn't match");
        Assert.assertEquals(Strings.getTextAfterColon(textBoxPage.getUserEmail()), TestingDataParser.getEmail(), "Text doesn't match");
        Assert.assertEquals(Strings.getTextAfterColon(textBoxPage.getCurrentAddress()), TestingDataParser.getCurrentAddress(), "Text doesn't match");
        Assert.assertEquals(Strings.getTextAfterColon(textBoxPage.getPermanentAddress()), TestingDataParser.getPermanentAddress(), "Text doesn't match");

        textBoxPage.clickButtons();

        Assert.assertTrue(buttonsPage.isOpened(),"Buttons page is not opened");

        buttonsPage.clickClickMeButton();

        Assert.assertEquals(buttonsPage.getDynamicClickMessage(), DYNAMIC_CLICK_MESSAGE,"Text doesn't match");

        buttonsPage.clickRightClickButton();

        Assert.assertEquals(buttonsPage.getRightClickMessage(), RIGHT_CLICK_MESSAGE, "Text doesn't match");

        buttonsPage.clickDoubleClickButton();

        Assert.assertEquals(buttonsPage.getDoubleClickMessage(), DOUBLE_CLICK_MESSAGE, "Text doesn't match");

        browser.scrollPage();
        buttonsPage.clickAlertsFrameAndWindowsButton();
        buttonsPage.clickBrowserWindowsButton();

        Assert.assertTrue(browserWindowsPage.isOpened(), "Browser Windows page is not opened");

        browserWindowsPage.clickNewTabButton();
        browser.switchToNewTabWindow();
        browser.closeTabWindow();
        browser.switchToOriginalTabWindow();
        browserWindowsPage.clickNewWindowButton();
        browser.switchToNewTabWindow();
        browser.closeTabWindow();
        browser.switchToOriginalTabWindow();
        browserWindowsPage.clickAlertsButton();

        Assert.assertTrue(alertsPage.isOpened(), "Alerts page is not opened");

        alertsPage.clickButtonToSeeAlert();

        Assert.assertEquals(alert.getAlertText(), ALERT_MESSAGE , "Text is not the same");

        alert.alertAccept();

        Assert.assertFalse(alert.alertIsPresented(), "Alert is not closed");

        alertsPage.clickButtonToSeeAlertWithWaiting();
        alert.waitAlert();

        Assert.assertEquals(alert.getAlertText(), ALERT_WITH_WAITING_MESSAGE, "Text is not the same");

        alert.alertAccept();

        Assert.assertFalse(alert.alertIsPresented(), "Alert is not closed");

        alertsPage.clickButtonConfirmBoxAlert();
        alert.waitAlert();

        Assert.assertEquals(alert.getAlertText(), CONFIRM_ALERT_MESSAGE, "Text is not the same");

        alert.alertAccept();

        Assert.assertFalse(alert.alertIsPresented(), "Alert is not closed");
        Assert.assertEquals(alertsPage.getConfirmResultText(),  CONFIRM_RESULT_MESSAGE, "Result text is not the same");

        alertsPage.clickButtonToSeePromptAlert();
        alert.waitAlert();

        Assert.assertEquals(alert.getAlertText(), PROMPT_ALERT_MESSAGE, "Text is not the same");

        alert.alertSendText(TestingDataParser.getTextForPrompt());
        alert.alertAccept();

        Assert.assertFalse(alert.alertIsPresented(), "Alert is not closed");
        Assert.assertEquals(alertsPage.getResultPromptText(),String.format(PROMPT_RESULT_MESSAGE, TestingDataParser.getTextForPrompt()), "Text is not the same");

    }
}
