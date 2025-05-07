package tests;

import org.junit.Test;
import pages.DragAndDropPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DragAndDropTests extends BaseTest {

    @Test
    public void userCanDragBoxAontoB() {
        DragAndDropPage dnd = new DragAndDropPage(driver);
        dnd.dragAontoB();
        assertThat(dnd.headerTextOfA(), is("B"));   // header text swaps when successful
    }
}
