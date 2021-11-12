package Main;

import app.DataManager;
import app.Menu;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        DataManager manager = new DataManager();
        HashMap words_dbase = manager.dataloader();
        Scanner scan = new Scanner(System.in);
        String answer;
        Menu menu = new Menu();
        while(true){
            //Menu
            System.out.print("Type 1 to traduce some word\n" +
                    "2 if you like to see all words in data base\n" +
                    "3 if you like to add a new word to data base\n" +
                    "If you like to finish the program type 0: ");
            answer = scan.nextLine();
            if(answer.equals("0")){
                manager.updateDbase(words_dbase);
                System.out.println("Program finished");
                break;
            }
            words_dbase = menu.response(answer, words_dbase);

        }
    }
}