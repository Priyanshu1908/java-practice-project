package FileHandling;

import java.io.IOException;
import java.util.Scanner;

public class ReadFile extends CreateFile{
    public static void main(String[] args) {
        try(Scanner reader = new Scanner(file)){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
