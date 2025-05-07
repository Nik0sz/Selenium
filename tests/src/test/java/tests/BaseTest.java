package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.DriverFactory;

public abstract class BaseTest {

    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.remoteChrome();
    }

    @After
    public void tearDown() {
        if (driver != null) { driver.quit(); }
    }
}
