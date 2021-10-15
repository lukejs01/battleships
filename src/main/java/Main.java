import view.Menu;
import utils.FileReader;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {



        FileReader reader = new FileReader();
        reader.readFile();
        Menu menu = new Menu();
        menu.displayMenu();
        menu.userGameModeChoice();

// when creating boats loop through list from file
//        if boat deconstruct and create
    }


}
