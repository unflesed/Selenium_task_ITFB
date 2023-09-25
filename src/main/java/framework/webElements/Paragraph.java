package framework.webElements;

import org.openqa.selenium.By;

public class Paragraph extends BaseElement {
    public Paragraph(By locator){
        super(locator);
    }

    public String getText() throws Exception {
        return findElement().getText();
    }

}
