package app;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public HashMap response(String answer, HashMap words_dbase){
        if(answer.equals("1")){
            translate(words_dbase);
        }
        else if(answer.equals("2")){
            System.out.println("\nData Base\n" +
                    "---------");
            words_dbase.forEach((key, value) -> System.out.println(key+" "+value));
            System.out.println();
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
        System.out.print("Type a word to translate(spanish -> english): ");
        String word = scan.nextLine();
        if (words_dbase.get(word) != null) {
            System.out.println("\n"+words_dbase.get(word)+"\n");
        } else {
            System.out.println("\nWord not found.\n");
        }
    }

    public HashMap registerWord(HashMap words_dbase){
        System.out.print("Type the word in spanish: ");
        String spanish = scan.nextLine();
        System.out.print("Type the word in english: ");
        String english = scan.nextLine();
        words_dbase.put(spanish.toLowerCase(), english.toLowerCase());
        System.out.println("\nWord successfully added\n");
        return words_dbase;
    }
}
