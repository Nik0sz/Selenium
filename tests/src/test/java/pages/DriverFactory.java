package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.LocalFileDetector;

import java.net.URL;

// Builds a RemoteWebDriver that talks to the Selenium container started by docker-compose (http://selenium:4444/wd/hub).

public final class DriverFactory {

    private DriverFactory() { } //

    public static RemoteWebDriver remoteChrome() {
        try {
            ChromeOptions opts = new ChromeOptions();
            opts.addArguments("--window-size=1800,960",
                              "--incognito",
                              "--disable-infobars");
            opts.setCapability("enableVNC", true);

            RemoteWebDriver drv =
                    new RemoteWebDriver(
                            new URL("http://selenium:4444/wd/hub"), opts);

            drv.setFileDetector(new LocalFileDetector());
            return drv;

        } catch (Exception e) {
            throw new RuntimeException("Unable to create remote driver", e);
        }
    }
}
