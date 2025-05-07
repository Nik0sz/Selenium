package tests;

import org.junit.Test;
import pages.FileUploadPage;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class FileUploadTests extends BaseTest {

    @Test
    public void userCanUploadAFile() throws Exception {
        // create a tiny temp file inside the container
        Path temp = Files.createTempFile("upload-test-", ".txt");
        Files.write(temp, "Hello upload".getBytes());

        FileUploadPage page = new FileUploadPage(driver);
        page.uploadFile(temp.toAbsolutePath().toString());

        assertThat(page.uploadedFileName(), containsString(temp.getFileName().toString()));
    }
}
