package Menu;
import Information.*;
import Book.*;




public class Menu {
    private static final String view = "view";
    private static final String reserve = "^reserve\\s|A|B|C|D$";
    private static String outPut;
    public static Book libBook;
    public Information information;
    private String[] menuOptions;
    private String menuOptionsContent;

    public Menu(){
        menuOptions = new String[4];
    }


//    public static String Options(String menusOption) {
//
//        if(menusOption.equals(view)){
//            outPut = "A\\nB\\nC\\nD";
//        }
//        else if(menusOption.matches(reserve)){
//            if(menusOption.substring(menusOption.length()-1).equals("A")){
//                libBook = new Book("A","valid");
//                if(libBook.getBookStatus().equals("valid")){
//                    outPut = ;
//                }
//            }
//
//        }
//    }


    public String[] CreateMenuOptions() {
        menuOptions[0] = "help";
        menuOptions[1] = "view";
        menuOptions[2] = "reserve exampleBook";
        menuOptions[3] = "check";
        return menuOptions;
    }

    public String getMenuOptionsContent(String[] menuOptions) {

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

    public String CheckPrintContent(String[] menuOptions) {
        String checkPrintContent;
        checkPrintContent = menuOptions[3] + "  Check your library number\n";
        return checkPrintContent;
    }
}
