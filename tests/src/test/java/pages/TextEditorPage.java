package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TextEditorPage extends BasePage {

    private final By iframe = By.cssSelector("iframe[id='mce_0_ifr']");

    public TextEditorPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
        driver.switchTo().defaultContent();
    }

    public void typeText(String text) {
        ((JavascriptExecutor) driver)
            .executeScript("tinymce.activeEditor.setContent(arguments[0]);", text);
    }

    public String readText() {
        return (String) ((JavascriptExecutor) driver)
            .executeScript(
                "return tinymce.activeEditor.getContent({format:'text'});");
    }
}
