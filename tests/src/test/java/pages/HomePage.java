package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final String URL = "https://the-internet.herokuapp.com/";

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(URL);
        wait.until(d -> d.getTitle().contains("The Internet"));
    }

    public LoginPage openLoginPage() {
        waitAndReturnElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }

    public CheckboxesPage openCheckboxes() {
        waitAndReturnElement(By.linkText("Checkboxes")).click();
        return new CheckboxesPage(driver);
    }

    public DropdownPage openDropdown() {
        waitAndReturnElement(By.linkText("Dropdown")).click();
        return new DropdownPage(driver);
    }

    public InputsPage openInputs() {
        waitAndReturnElement(By.linkText("Inputs")).click();
        return new InputsPage(driver);
    }

    public TextEditorPage openTextEditor() {
        waitAndReturnElement(By.linkText("WYSIWYG Editor")).click();
        return new TextEditorPage(driver);
    }

    public ChallengingDomPage openChallengingDom() {
        waitAndReturnElement(By.linkText("Challenging DOM")).click();
        return new ChallengingDomPage(driver);
    }
}
