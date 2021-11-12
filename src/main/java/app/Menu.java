package app;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    public HashMap response(String answer, HashMap words_dbase){
        if(answer.equals("1")){
            translate(words_dbase);
        }
        else if(answer.equals("2")){
            words_dbase.forEach((key, value) -> System.out.println(key+" "+value));
        }
        else if(answer.equals("3")){
            words_dbase = registerWord(words_dbase);
        }
        else{
            System.out.println("Wrong input");
        }
        return words_dbase;
    }


    public void translate(HashMap words_dbase) {
        System.out.print("Type a word to see a traduce in english: ");
        String word = scan.nextLine();
        if (words_dbase.get(word) != null) {
            System.out.println(words_dbase.get(word));
        } else {
            System.out.println("Word not found.");
        }
        System.out.print("Type 0 to finish the program: ");
    }

    public HashMap registerWord(HashMap words_dbase){
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the word in spanish: ");
        String spanish = scan.nextLine();
        System.out.print("Type the word in english: ");
        String english = scan.nextLine();
        words_dbase.put(spanish, english);
        return words_dbase;
    }
}
