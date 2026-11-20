package LambdaExpressions;

public class LambdaExpressionAsMethodParameters {

    public static void main(String[] args) {

        StringFunction exclaim = s -> s + "!";
        StringFunction question = s -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("There", question);
    }

    public static void printFormatted(String str, StringFunction format){

        String result = format.run(str);
        System.out.println(result);
    }

    interface StringFunction{
        String run(String str);
    }
}
