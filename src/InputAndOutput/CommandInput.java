package InputAndOutput;
import java.util.*;

public class CommandInput {

    public String ReadInput(){
        String inputContent = "";
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext() ){
             inputContent  = scanner.nextLine();
        }
        return inputContent;

    }
}
