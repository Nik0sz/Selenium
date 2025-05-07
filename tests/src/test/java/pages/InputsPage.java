package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPage extends BasePage {

    private final By input = By.tagName("input");

    public InputsPage(WebDriver driver) {
        super(driver);
        wait.until(d -> d.findElement(input).isDisplayed());
    }

    public void typeNumber(String number) {
        WebElement field = waitAndReturnElement(input);
        field.clear();
        field.sendKeys(number);
    }

    public String readValue() {
        return waitAndReturnElement(input).getAttribute("value");
    }
}
