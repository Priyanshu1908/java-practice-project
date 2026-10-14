package IOStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    static String defaultPath = System.getProperty("user.dir");
    static String FS = "/";
    static String filepath = defaultPath + FS + "src/IOStreams" + FS + "TextFile.txt";
    public static void main(String[] args) {

        try(FileOutputStream writer = new FileOutputStream(filepath)) {

            String text = "This is the text which is written by FileOutputSteam.";
            writer.write(text.getBytes());
            System.out.println("Successfully written on file.");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
