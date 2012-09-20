package TestMenu;

import Book.BookList;
import Menu.Menu;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class TestMenu {
    @Test
    public void CreateMenuOptions() throws Exception {
        Menu menu = new Menu();
        assertEquals(menu.CreateMenuOptions()[0],"help");
        assertEquals(menu.CreateMenuOptions()[1],"view");
        assertEquals(menu.CreateMenuOptions()[2],"reserve exampleBook");
        assertEquals(menu.CreateMenuOptions()[3],"check");
    }

    @Test
    public void TestListMenuOptionsContent() throws Exception {
        Menu menu = new Menu();
        String menuOptionsListContent = "help  List all menu options\n" +
                "view  View all books\n" +
                "reserve [--bookName]  Reserve one book called bookName\n" +
                "check  Check your library number\n";
        assertEquals(menuOptionsListContent,menu.ListMenuOptionsContent(menu.CreateMenuOptions()));

    }
    @Test
    public void TestSelectInvalidMenuOption() throws Exception {
        Menu menu = new Menu();
        String selectInvalidMenuOption = "Select a valid option!!";
        assertEquals(selectInvalidMenuOption,menu.SelectInvalidMenuOptionPrintContent());

    }

    @Test
    public void TestHelpPrintContent() throws Exception {
        Menu menu = new Menu();
        String helpContent = "view  View all books\n" +
                "reserve [--bookName]  Reserve one book called bookName\n" +
                "check  Check your library number\n";
        assertEquals(helpContent,menu.HelpPrintContent(menu.CreateMenuOptions()));

    }

    @Test
    public void TestViewPrintContent() throws Exception {
        Menu menu = new Menu();
        String viewContent = "bookA\n" + "bookB\n" + "bookC\n" + "bookD\n";
        assertEquals(viewContent,menu.ViewPrintContent(new BookList().CreateBookList()));
    }

    @Test
    public void TestReserveValidPrintContent() throws Exception {
        Menu menu = new Menu();
        String reserveValidContent = "Thank You! Enjoy the book.\n";
        assertEquals(reserveValidContent,menu.ReserveValidPrintContent());
    }

    @Test
    public void TestReserveInvalidPrintContent() throws Exception {
        Menu menu = new Menu();
        String reserveInvalidContent = "Sorry we don't have that book yet.\n";
        assertEquals(reserveInvalidContent,menu.ReserveInvalidPrintContent());
    }

    @Test
    public void TestCheckPrintContent() throws Exception {
        Menu menu = new Menu();
        String checkListContent = "Please talk to Librarian. Thank you.\n";
        assertEquals(checkListContent,menu.CheckPrintContent());
    }



    /*******************************************************************/

    @Test
    public void TestInvalidMenuOption() throws Exception {
        Menu menu = new Menu();
        String MenuOption = "invalidOption";
        String PrintContent = menu.SelectInvalidMenuOptionPrintContent();
        assertEquals(PrintContent,menu.Judge(MenuOption));
    }

    @Test
    public void TestHelpOption() throws Exception {
        Menu menu = new Menu();
        String MenuOption = "help";
        String PrintContent = menu.HelpPrintContent(menu.CreateMenuOptions());
        assertEquals(PrintContent,menu.Judge(MenuOption));
    }

   @Test
    public void TestViewOption() throws Exception {
        Menu menu = new Menu();
        String MenuOption = "view";
        String PrintContent = menu.ViewPrintContent(new BookList().CreateBookList());
        assertEquals(PrintContent,menu.Judge(MenuOption));
    }

    @Test
    public void TestReserveInvalidBook() throws Exception {
        Menu menu = new Menu();
        String MenuOption = "reserve bookC";
        String PrintContent = menu.ReserveInvalidPrintContent();
        assertEquals(PrintContent,menu.Judge(MenuOption));

        String MenuOption1 = "reserve bookE";
        assertEquals(PrintContent,menu.Judge(MenuOption1));

    }

    @Test
    public void TestReserveValidBook() throws Exception {
        Menu menu = new Menu();
        String MenuOption = "reserve bookA";
        String PrintContent = menu.ReserveValidPrintContent();
        assertEquals(PrintContent,menu.Judge(MenuOption));
    }

    @Test
    public void TestCheck() throws Exception {
        Menu menu = new Menu();
        String MenuOption = "check";
        String PrintContent = menu.CheckPrintContent();
        assertEquals(PrintContent,menu.Judge(MenuOption));
    }
}
