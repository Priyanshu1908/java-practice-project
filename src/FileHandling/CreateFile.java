package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateFile {

    static String defaultPath = System.getProperty("user.dir");
    static String FS = "/";
    static String filepath = defaultPath + FS + "src/FileHandling" + FS + "TestFile.txt";

    static Path path = Path.of(filepath);
    static File file = new File(filepath);
    public static void main(String[] args) {

        System.out.println("Default path is: " + defaultPath);
//        File filepath = new File(".");
//        System.out.println(filepath.getAbsolutePath());
//        Path path = Path.of("").toAbsolutePath();
//        System.out.println(path.toAbsolutePath());

        try{
            if(file.createNewFile()){
                System.out.println("File is created with the name: " + file.getName());
            }else {
                System.out.println("File already exists!");
                if(file.exists()){
                    Files.delete(path);
                    System.out.println("File is deleted. You can create a new file again.");
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
