package IOStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputSteamTest extends FileOutputStreamTest {

    public static void main(String[] args) {

        try(FileInputStream reader = new FileInputStream(filepath)) {
            int i;
            while((i = reader.read()) != -1){
                System.out.print((char) i);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
