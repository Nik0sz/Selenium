package tests;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import pages.EntryAdPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CookieManipulationTests extends BaseTest {

    @Test
    public void avoidModalByPreSettingCookie() {
        driver.get("https://the-internet.herokuapp.com");

        Cookie modalDone = new Cookie.Builder("modal", "dismissed")
                .domain("the-internet.herokuapp.com")
                .path("/")   
                .build();

        driver.manage().addCookie(modalDone);

        EntryAdPage page = new EntryAdPage(driver);

        assertThat("modal should be hidden thanks to cookie",
                   page.modalIsDisplayed(), is(false));
    }
}
