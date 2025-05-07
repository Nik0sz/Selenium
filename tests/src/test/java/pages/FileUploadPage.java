package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FileUploadPage extends BasePage {

    private final By input  = By.id("file-upload");
    private final By submit = By.id("file-submit");
    private final By uploaded = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
        driver.get("https://the-internet.herokuapp.com/upload");
    }

    public void uploadFile(String absolutePath) {
        driver.findElement(input).sendKeys(absolutePath);
        driver.findElement(submit).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploaded));
    }

    public String uploadedFileName() {
        return driver.findElement(uploaded).getText();
    }
}
