package project.pages;

import framework.webElements.Button;
import framework.webElements.DivWithText;
import org.openqa.selenium.By;

public class ElementsPage extends BaseForm{
    private static DivWithText text = new DivWithText(By.xpath("//div[@class='main-header' and text()='Elements']"));
    private static Button textBoxButton = new Button(By.xpath("//span[text()='Text Box']"));

    public ElementsPage() {
        super(text);
    }

    public void clickTextBoxButton() throws Exception {
        textBoxButton.clickElement();
    }
}
