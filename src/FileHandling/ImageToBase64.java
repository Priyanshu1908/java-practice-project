package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;
import java.util.Scanner;

public class ImageToBase64 {

    static final String FS = File.separator;
    static final String filepath = System.getProperty("user.dir") + FS + "src/FileHandling" + FS + "photo.jpg";
    static File file = new File(filepath);
    static String base64String;
    public static void main(String[] args) {
        try{
            byte[] bytes = Files.readAllBytes(file.toPath());
            base64String = Base64.getEncoder().encodeToString(bytes);
            System.out.println("Base64 String: " + base64String);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(Scanner scanner = new Scanner(file)) {
            byte[] decodedBytes = Base64.getDecoder().decode(base64String);
            String outputFilePath = System.getProperty("user.dir") + FS + "src/FileHandling" + FS + "decoded_photo.jpg";
            Files.write(new File(outputFilePath).toPath(), decodedBytes);
            System.out.println("Decoded image saved to: " + outputFilePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
