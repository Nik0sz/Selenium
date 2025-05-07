package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckboxesPage extends BasePage {

    private final By checkboxes = By.cssSelector("#checkboxes input");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.numberOfElementsToBe(checkboxes, 2));
    }

    private WebElement cb(int index) {
        return driver.findElements(checkboxes).get(index);
    }

    public void setFirstCheckbox(boolean value) {
        if (cb(0).isSelected() != value) { cb(0).click(); }
    }

    public boolean firstCheckboxIsSelected() {
        return cb(0).isSelected();
    }
}
