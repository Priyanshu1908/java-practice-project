package FileHandling;

public class GetFileInformation extends CreateFile{

    public static void main(String[] args) {

        if(file.exists()){
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Writable: " + file.canWrite());
            System.out.println("Is Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        }else{
            System.out.println("File doesn't exists!");
        }
    }
}
