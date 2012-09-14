package TestMenu;

import Menu.Menu;
import org.junit.Test;

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
    public void TestMenuOptionsListContent() throws Exception {
        Menu menu = new Menu();
        String menuOptionsListContent = "help  List all menu options\n" +
                "view  View all books\n" +
                "reserve [--bookName]  Reserve one book called bookName\n" +
                "check  Check your library number\n";
        assertEquals(menuOptionsListContent,menu.getMenuOptionsContent(menu.CreateMenuOptions()));

    }

    @Test
    public void TestHelp() throws Exception {
        Menu menu = new Menu();
        String helpListContent = "view  View all books\n" +
                "reserve [--bookName]  Reserve one book called bookName\n" +
                "check  Check your library number\n";
        assertEquals(helpListContent,menu.HelpPrintContent(menu.CreateMenuOptions()));

    }

//    @Test
//    public void TestReservePrintContent() throws Exception {
//        Menu menu = new Menu();
//        String inputMenuOption = "reserve bookA";
//    }

    @Test
    public void TestCheck() throws Exception {
        Menu menu = new Menu();
        String checkListContent = "check  Check your library number\n";
        assertEquals(checkListContent,menu.CheckPrintContent(menu.CreateMenuOptions()));

    }
}
