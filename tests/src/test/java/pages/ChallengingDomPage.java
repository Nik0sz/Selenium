package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChallengingDomPage extends BasePage {

    // A deliberately ugly XPath to satisfy complex xpath requirement
    private static final By crazyLink = By.cssSelector("a[href='#edit']");

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(crazyLink));
    }

    public void clickCrazyEditLink() {
        waitAndReturnElement(crazyLink).click();
    }
}
