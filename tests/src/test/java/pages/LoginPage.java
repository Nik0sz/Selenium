package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By submit   = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
    }

    public SecureAreaPage loginAs(String user, String pwd) {
        waitAndReturnElement(username).sendKeys(user);
        waitAndReturnElement(password).sendKeys(pwd);
        waitAndReturnElement(submit).click();
        return new SecureAreaPage(driver);
    }
}
