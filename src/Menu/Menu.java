package Menu;
import Information.*;
import Book.*;

import java.util.ArrayList;


public class Menu {

    private String[] menuOptions;
    private String menuOptionsContent;
    private BookList bookList;

    public Menu(){
        menuOptions = new String[4];
        bookList = new BookList();
    }

    public String[] CreateMenuOptions() {
        menuOptions[0] = "help";
        menuOptions[1] = "view";
        menuOptions[2] = "reserve exampleBook";
        menuOptions[3] = "check";
        return menuOptions;
    }

    public String ListMenuOptionsContent(String[] menuOptions) {

        menuOptionsContent = menuOptions[0] + "  List all menu options\n"
                + menuOptions[1] +"  View all books\n"
                + menuOptions[2].substring(0,7)+ " [--bookName]  Reserve one book called bookName\n"
                + menuOptions[3] +"  Check your library number\n";
        return menuOptionsContent;
    }

    public String HelpPrintContent(String[] menuOptions) {
        String helpPrintContent;
        helpPrintContent = menuOptions[1] +"  View all books\n"
                + menuOptions[2].substring(0,7)+ " [--bookName]  Reserve one book called bookName\n"
                + menuOptions[3] +"  Check your library number\n";
        return helpPrintContent;
    }

    public String ViewPrintContent(ArrayList<Book> booksList) {
        String ViewPrintContent = new String();
        for(int i = 0;i < booksList.size(); i ++)
        {
            ViewPrintContent += booksList.get(i).getBookName() + "\n";
        }
        return ViewPrintContent;
    }

    public String CheckPrintContent() {
        Information information = new Information();
        return information.getCheckLibNumInformation();
    }

    public String ReserveValidPrintContent() {
        Information information = new Information();
        return information.getValidBookInformation();
    }

    public String ReserveInvalidPrintContent() {

        Information information;
        information = new Information();
        return information.getInvalidBookInformation();
    }

    public String SelectInvalidMenuOptionPrintContent() {
        Information information = new Information();
        return information.getInvalidOptionInformation();
    }

    public String Judge(String menuOption) {
        String PrintContent = null;
        ArrayList<Book> bookArrayList = bookList.CreateBookList();

        if(menuOption.equals("help")){
            PrintContent = HelpPrintContent(CreateMenuOptions());
        }
        else if(menuOption.equals("view")){
            PrintContent = ViewPrintContent(bookArrayList);
        }
        else if(menuOption.matches("reserve\\s(.*)")){

                for(int i = 0; i < bookArrayList.size(); i++){
                    if(menuOption.split("\\s")[1].equals(bookArrayList.get(i).getBookName())){
                        if(bookArrayList.get(i).getBookStatus().equals("valid")){
                            PrintContent = ReserveValidPrintContent();
                        }
                        else{
                              PrintContent = ReserveInvalidPrintContent();
                        }
                        break;
                    }
                    else{
                        PrintContent = ReserveInvalidPrintContent();
                    }
                }
        }
        else if(menuOption.equals("check")){
            PrintContent = CheckPrintContent();
        }
        else{
            PrintContent = SelectInvalidMenuOptionPrintContent();
        }
        return PrintContent;

    }

}
