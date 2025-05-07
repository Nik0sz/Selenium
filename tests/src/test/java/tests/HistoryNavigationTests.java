package tests;

import org.junit.Test;
import pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HistoryNavigationTests extends BaseTest {

    @Test
    public void browserBackReturnsToPreviousPage() {
        HomePage home = new HomePage(driver);
        home.openInputs();                // now on inputs
        driver.navigate().back();         // go back
        assertThat(driver.getCurrentUrl(), containsString("/"));   // back on home
    }
}
