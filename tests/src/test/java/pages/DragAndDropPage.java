package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DragAndDropPage extends BasePage {

    private final By boxA = By.id("column-a");
    private final By boxB = By.id("column-b");

    public DragAndDropPage(WebDriver driver) {
        super(driver);
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
    }

    // HTML5 drag and drop via JavaScript because native Actions often fail. 
    public void dragAontoB() {
        String js =
            "function dnd(s,t){const dt=new DataTransfer();" +
            "s.dispatchEvent(new DragEvent('dragstart',{dataTransfer:dt}));" +
            "t.dispatchEvent(new DragEvent('drop',{dataTransfer:dt}));" +
            "s.dispatchEvent(new DragEvent('dragend',{dataTransfer:dt}));}" +
            "dnd(arguments[0],arguments[1]);";
        ((JavascriptExecutor) driver).executeScript(js,
                driver.findElement(boxA), driver.findElement(boxB));
    }

    public String headerTextOfA() {
        return driver.findElement(boxA).getText();
    }
}
