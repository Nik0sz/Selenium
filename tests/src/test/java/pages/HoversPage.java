package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoversPage extends BasePage {

    private final By figures = By.cssSelector(".figure");

    public HoversPage(WebDriver driver) {
        super(driver);
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    // Hover over nth 0 based picture and return the caption text. 
    public String hoverCaption(int index) {
        new Actions(driver).moveToElement(driver.findElements(figures).get(index)).perform();
        return driver.findElements(By.cssSelector(".figcaption h5")).get(index).getText();
    }
}
