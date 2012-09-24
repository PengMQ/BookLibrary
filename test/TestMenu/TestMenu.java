package TestMenu;

import Book.BookList;
import Menu.Menu;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import Movie.*;
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
        String selectInvalidMenuOption = "Select a valid option!!\n";
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
    public void TestViewMoviePrintContent(){
        Menu menu = new Menu();
        ArrayList<Movie> movieList = new MovieList().CreateMovieList();
        String viewMovieContent = "Pride and prejudice       Joe Write           10\n"
                +"Love Story\t\t\t\tArthur Hiller       9\n"
                +"Breakfast At Tiffany‘s\tBlake Edwards\t\t8\n"
                +"The Godfather\t\t\t\tFrancisFordCoppola \t10\n"
                +"Casablanca\t\t\t\tMichael Curtiz\t\t8\n"
                +"Roman Holiday\t\t\t\tWilliam Wyler\t\t10\n"
                +"The Silence of the Lambs\tJonathan Demme\t\t9\n"
                +"Leon\t\t\t\t\t\tLuc Besson\t\t\t10\n"
                +"Farewell My Concubine\t\tKaige Chen\t\t\t8\n"
                +"Flower Like Years\t\tKarwai Wong\t\t\t10\n"
                +"Se7en \t\t\t\t\tDavid Leo Fincher\t6\n"
                +"Titanic\t\t\t\t\tJames Cameron\t\t7\n"
                +"The Piano\t\t\t\tJane Campbell PiEn\t8\n"
                +"Gone with the Wind\t\tVictor Fleming\t\t8\n"
                +"Brave Heart              Mel Gibson          N/A\n";
        assertEquals(viewMovieContent,menu.viewMoviePrintContent(movieList));
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

    @Test
    public void TestViewMovie() throws Exception {
        Menu menu = new Menu();
        ArrayList<Movie>  movieList = new MovieList().CreateMovieList();
        String menuOption = "viewMovie";
        String PrintContent = menu.viewMoviePrintContent(movieList);
        assertEquals(PrintContent,menu.Judge(menuOption));
    }
}
