package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TextEditorPage extends BasePage {

    private final By iframe = By.cssSelector("iframe[id='mce_0_ifr']");
    private final By body   = By.id("tinymce");

    public TextEditorPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
    }

    public void typeText(String text) {
        WebElement editable = waitAndReturnElement(body);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].innerHTML = arguments[1];",
                               editable, text);
    }

    public String readText() {
        return waitAndReturnElement(body).getText();
    }
}
