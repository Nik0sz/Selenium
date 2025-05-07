package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

// Wraps entry ad and lets us dismiss or pre-empt the modal via cookies. 
public class EntryAdPage extends BasePage {

    private static final String URL   = "https://the-internet.herokuapp.com/entry_ad";
    private static final By     MODAL = By.id("modal");

    public EntryAdPage(WebDriver driver) {
        super(driver);
        driver.get(URL);
        wait.until(ExpectedConditions.presenceOfElementLocated(MODAL));
    }

    //Close the modal by clicking its Close link. 
    public void closeModal() {
        waitAndReturnElement(By.cssSelector("#modal .modal-footer p")).click();
    }

    // Returns true if the modal is still displayed. 
    public boolean modalIsDisplayed() {
        return driver.findElement(MODAL).isDisplayed();
    }

    // Returns whichever cookie the page writes after the modal is closed. 
    public Cookie getDismissCookie() {
        return driver.manage().getCookies().stream()
                     .filter(c -> c.getName().startsWith("modal"))
                     .findFirst()
                     .orElse(null);
    }
}
