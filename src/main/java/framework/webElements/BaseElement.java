package framework.webElements;

import framework.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class BaseElement {
    protected By locator;

    public BaseElement(By locator) {
        this.locator = locator;
    }

    protected WebElement findElement() throws Exception {
        return Driver.getDriver().findElement(locator);
    }

    public int findElementsSize() throws Exception {
        return Driver.getDriver().findElements(locator).size();
    }

    public boolean isDisplayed() throws Exception {
        if (findElementsSize() > 0) {
            return true;
        }
        return false;
    }

    public void clickElement() throws Exception {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", findElement());
    }

    public void rightClickElement() throws Exception {
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(findElement()).perform();
    }

    public void doubleClickElement() throws Exception {
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(findElement()).perform();
    }
}
