package TestInformation;

import Information.Information;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestInformation {

    private Information createInformation() {
       return new Information();
    }

    @Test
    public void getWelcomeInformation() throws Exception {
        Information information = createInformation();
        assertEquals("Welcome",information.getWelcomeInformation());
    }

    @Test
    public void getInvalidOptionInformation() {
        Information information = createInformation();
        assertEquals("Select a valid option!!\n",information.getInvalidOptionInformation());
    }

    @Test
    public void getValidBookInformation() {
        Information information = createInformation();
        assertEquals("Thank You! Enjoy the book.\n",information.getValidBookInformation());
    }

    @Test
    public void getInvalidBookInformation() {
        Information information = createInformation();
        assertEquals("Sorry we don't have that book yet.\n",information.getInvalidBookInformation());
    }

    @Test
    public void getCheckLibNumInformation(){
        Information information = createInformation();
        assertEquals("Please talk to Librarian. Thank you.\n",information.getCheckLibNumInformation());
    }
}
