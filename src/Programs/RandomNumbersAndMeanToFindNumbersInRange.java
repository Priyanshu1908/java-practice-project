package Programs;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;
import java.util.*;

class RandomNumbersAndMeanToFindNumbersInRange {

    public static int num =0;
    public static int sum = 0;
    public static int mean = 0;


    public static void main(String[] args)
    {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<10;i++){
            num  = rnd.nextInt(100);
            list.add(num);
            sum = sum + num;
        }
        System.out.println(list);

        mean = sum/10;
        System.out.println(mean);

        int maxValue = mean + 5;
        int minValue = mean - 5;

        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer integer : list) {
            if (integer > minValue & integer < maxValue) {
                list2.add(integer);
            }
        }

        System.out.println(list2);

    }
}