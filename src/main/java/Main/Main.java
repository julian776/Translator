package Main;

import app.DataManager;
import app.Menu;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataManager manager = new DataManager();
        HashMap words_dbase = manager.dataloader();
        Scanner scan = new Scanner(System.in);
        String answer;
        Menu menu = new Menu();
        while(true){
            answer = scan.nextLine();
            words_dbase = menu.response(answer, words_dbase);
            System.out.print("If you like to finish the program type 0: ");
            if((scan.nextLine()).equals("0")){
                manager.updateDbase(words_dbase);
                System.out.println("Program finished");
                break;
            }
        }
    }
}