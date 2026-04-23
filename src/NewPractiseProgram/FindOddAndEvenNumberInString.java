package NewPractiseProgram;

public class FindOddAndEvenNumberInString {

    public static void main(String[] args) {

        String input = "15 January";

        String[] s = input.split(" ");
        int x = Integer.parseInt(s[0]);

        if(x % 2 == 0){
            System.out.println("Even Number: " + x);
        }else {
            System.out.println("Odd Number: " + x);
        }

    }
}
