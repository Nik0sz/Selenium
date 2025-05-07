package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    private final By flash   = By.id("flash");
    private final By logout  = By.cssSelector(".icon-signout");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
        wait.until(d -> d.getCurrentUrl().contains("/secure"));
    }

    public String getFlashMessage() {
        return waitAndReturnElement(flash).getText();
    }

    public LoginPage logout() {
        waitAndReturnElement(logout).click();
        return new LoginPage(driver);
    }
}
