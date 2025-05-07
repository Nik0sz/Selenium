package tests;

import org.junit.Test;
import pages.HoversPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HoverTests extends BaseTest {

    @Test
    public void hoveringRevealsProfileCaption() {
        HoversPage hovers = new HoversPage(driver);
        String caption = hovers.hoverCaption(0);
        assertThat(caption, containsString("name: user1"));
    }
}
