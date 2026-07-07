package NewPractiseProgram;

public class RemoveBeginningAndTrailingZerosFromNumber {

    public static void main(String[] args) {

        String s = "001200300";

        String s1 = s.replaceFirst("^0+","");

        String output = s1.replaceFirst("0+$","");

        System.out.println(output);

    }
}
