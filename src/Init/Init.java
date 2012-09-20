package Init;

import Information.Information;
import Menu.*;

public class Init {
    public void  InitOutput(){
        Information information = new Information();
        Menu menu = new Menu();
        String[] CreateMenu = menu.CreateMenuOptions();
        String allMenuOptions = menu.ListMenuOptionsContent(CreateMenu);
        String outPut = information.getWelcomeInformation()
                + "\n"
                + allMenuOptions;
        System.out.print(outPut);
    }
}
