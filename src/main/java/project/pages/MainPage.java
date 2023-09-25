package project.pages;

import framework.webElements.Button;
import framework.webElements.Image;
import org.openqa.selenium.By;

public class MainPage extends BaseForm {
    private static Image mainImage = new Image(By.cssSelector(".banner-image"));
    private static Button elementsButton = new Button(By.xpath("//div[@class='card-body']//h5[contains(text(),'Elements')]"));

    public MainPage() {
        super(mainImage);
    }

    public void clickElementsButton() throws Exception {
        elementsButton.clickElement();
    }
}
