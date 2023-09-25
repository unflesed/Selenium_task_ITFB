package framework.webElements;

import org.openqa.selenium.By;

public class Span extends BaseElement {
    public Span(By locator){
        super(locator);
    }

    public String getText() throws Exception {
        return findElement().getText();
    }
}
