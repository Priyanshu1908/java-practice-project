package IOStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest extends FileOutputStreamTest{

    public static void main(String[] args) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))){
            writer.write("This is the first line.");
            System.out.println("First line written in file.");
            writer.newLine();
            writer.write("This is the second line.");
            System.out.println("Second line written in file.");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filepath,true))){
            writer.newLine();
            writer.write("This is the third line.");
            System.out.println("Third line written in file.");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
