package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class LoginTests extends BaseTest {

    @Test
    public void userCanLoginAndLogout() {
        LoginPage login     = new HomePage(driver).openLoginPage();
        SecureAreaPage area = login.loginAs("tomsmith", "SuperSecretPassword!");
        assertThat(area.getFlashMessage(), containsString("You logged into a secure area!"));

        login = area.logout();
        assertThat(driver.getCurrentUrl(), containsString("/login"));
    }
}
