package tests;

import org.junit.Test;
import pages.CheckboxesPage;
import pages.HomePage;
import pages.InputsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CheckboxAndInputTests extends BaseTest {

    @Test
    public void canToggleCheckboxAndTypeNumber() {
        CheckboxesPage cbPage = new HomePage(driver).openCheckboxes();
        cbPage.setFirstCheckbox(true);
        assertThat(cbPage.firstCheckboxIsSelected(), is(true));

        InputsPage inputs = new HomePage(driver).openInputs();
        inputs.typeNumber("12345");
        assertThat(inputs.readValue(), is("12345"));
    }
}
