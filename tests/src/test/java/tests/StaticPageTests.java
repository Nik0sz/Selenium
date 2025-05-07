package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePage;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

// Demonstrates iterating through an easily-extendable list of static pages and asserting their titles.
 
public class StaticPageTests extends BaseTest {

    @Test
    public void everyStaticPageHasExpectedTitle() {
        List<String> paths = Arrays.asList(
                "status_codes/200",
                "status_codes/301",
                "status_codes/404"
        );

        for (String path : paths) {
            driver.get("https://the-internet.herokuapp.com/" + path);
            String h3 = driver.findElement(By.tagName("h3")).getText();
            assertThat(h3, containsString("Status Codes"));
        }
    }
}
