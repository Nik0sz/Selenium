package tests;

import org.junit.Test;
import pages.HomePage;
import pages.TextEditorPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TextAreaTests extends BaseTest {

    @Test
    public void canWriteIntoTinyMCEEditor() {
        TextEditorPage editor = new HomePage(driver).openTextEditor();
        editor.typeText("Hello tiny world!");
        assertThat(editor.readText(), containsString("Hello tiny world!"));
    }
}
