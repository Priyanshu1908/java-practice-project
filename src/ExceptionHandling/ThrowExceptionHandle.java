package ExceptionHandling;

public class ThrowExceptionHandle {

    public static void main(String[] args){
        try{
        String Data_Flag = " ";
        if(Data_Flag.equals(" ")){
            throw new Exception("No Value of Data Flag in Excel");
        }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Exception is handled");
    }
}
