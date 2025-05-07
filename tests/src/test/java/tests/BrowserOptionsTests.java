package tests;

import org.junit.Test;

// No assertions, success is session starts without error in incognito.
public class BrowserOptionsTests extends BaseTest {

    @Test
    public void driverStartsWithCustomOptions() {
        // any page is fine prove that incognito  disable-infobars didn't break startup
        driver.get("https://the-internet.herokuapp.com");
    }
}
