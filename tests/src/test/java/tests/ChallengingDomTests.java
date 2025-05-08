package tests;

import org.junit.Test;
import pages.ChallengingDomPage;
import pages.HomePage;

public class ChallengingDomTests extends BaseTest {

    @Test
    public void complexXpathEditButtonIsClickable() {
        ChallengingDomPage dom = new HomePage(driver).openChallengingDom();
        dom.clickCrazyEditLink();
        // nothing to assert if it wasn't found or clickable the test fails
    }
}
