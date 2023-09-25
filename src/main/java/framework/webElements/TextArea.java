package framework.webElements;

import org.openqa.selenium.By;

public class TextArea extends BaseElement{
    public TextArea(By locator) {
        super(locator);
    }

    public void sendText(String text) throws Exception {
        findElement().sendKeys(text);
    }
}
