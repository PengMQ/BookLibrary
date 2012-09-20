package TestInputAndOutput;

import InputAndOutput.CommandInput;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestInput {
    @Test
    public void GetRightInput() throws Exception {
       CommandInput commandInput = new CommandInput();
        String expectedInput = "help";
        String actualInput = commandInput.ReadInput();
        assertEquals(expectedInput,actualInput);

    }
}
