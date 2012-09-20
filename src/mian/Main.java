package mian;

import Information.Information;
import InputAndOutput.CommandInput;
import Menu.*;
import Init.*;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class Main {

    public static void main(String[] args){
        Init init = new Init();
        init.InitOutput();
        while(true){
            CommandInput commandInput = new CommandInput() ;
            Menu Menu = new Menu();
            String inputContent = commandInput.ReadInput();
            String outPutContent = Menu.Judge(inputContent);
            System.out.printf(outPutContent);
        }
    }


}
