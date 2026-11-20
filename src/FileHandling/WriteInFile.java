package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile extends CreateFile{
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter(filepath);
            writer.write("This is a text file to test writing in text file.");
            System.out.println("Text has been added or replaced in the existing file.");
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //try with resource
        try(FileWriter writer = new FileWriter(filepath,true)){
            writer.write("\nThis is the new text which is appended in existing file.");
            System.out.println("Text has been appended in the existing file.");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
