package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageUsingIOStream extends FileOutputStreamTest{

    static String photoPath = folderPath + FS + "photo.jpg";

    public static void main(String[] args) {

        try(FileInputStream reader = new FileInputStream(photoPath);
            FileOutputStream writer = new FileOutputStream(folderPath + FS + "duplicate.jpg")){
            int i;
            while((i = reader.read()) != -1){
                writer.write(i);
            }
            System.out.println("File copied successfully");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
