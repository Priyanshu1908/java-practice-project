package IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest extends FileOutputStreamTest {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
