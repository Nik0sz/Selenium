package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
        wait.until(d -> d.findElement(dropdown).isDisplayed());
    }

    public void choose(String visibleText) {
        new Select(driver.findElement(dropdown)).selectByVisibleText(visibleText);
    }

    public String selectedOption() {
        return new Select(driver.findElement(dropdown))
                .getFirstSelectedOption().getText();
    }
}
