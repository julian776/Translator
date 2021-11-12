package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;


public class DataManager {
    private String FILE = "data.txt";

    public HashMap dataloader(){
        HashMap <String, String> words = new HashMap<String, String>();
        try{
            FileReader text = new FileReader(FILE);
            BufferedReader read = new BufferedReader(text);

            String validate = "";
            String[] line;
            while(validate != null){
                validate = read.readLine();
                if(validate == null){
                    break;
                }
                line = validate.split("/");
                words.put(line[0], line[1]);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return words;
    }

    public void updateDbase(HashMap words_dbase){
        

    }
}
