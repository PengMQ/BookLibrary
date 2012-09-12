import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestInformation {
    @Test
    public void getWelcomeInformation() throws Exception {
        Information information = new Information();
        assertEquals("Welcome",information.getWelcomeInformation());

    }


}
