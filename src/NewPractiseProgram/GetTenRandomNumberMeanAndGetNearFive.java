package NewPractiseProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetTenRandomNumberMeanAndGetNearFive {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int n;
        Random num = new Random();
        for (int i = 1; i <= 10; i++) {
            n = num.nextInt(100);
            list.add(n);
            sum = sum + n;
        }

        int mean = sum / 10;
        int maxValue = mean + 5;
        int minValue = mean - 5;

        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (list.get(i) <= maxValue && list.get(i) >= minValue) {
                list1.add(list.get(i));
            }
        }
        System.out.println("Random Numbers: " + list);
        System.out.println("Mean: " + mean + "\n-------------------");
        System.out.println(list1);
    }
}
