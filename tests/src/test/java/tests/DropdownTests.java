package tests;

import org.junit.Test;
import pages.DropdownPage;
import pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DropdownTests extends BaseTest {

    @Test
    public void userCanChooseFromDropdown() {
        DropdownPage dd = new HomePage(driver).openDropdown();
        dd.choose("Option 2");
        assertThat(dd.selectedOption(), is("Option 2"));
    }
}
