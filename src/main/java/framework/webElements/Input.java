package framework.webElements;

import org.openqa.selenium.By;

public class Input extends BaseElement{
    public Input(By locator) {
        super(locator);
    }

    public void sendText(String text) throws Exception {
        findElement().sendKeys(text);
    }
}
