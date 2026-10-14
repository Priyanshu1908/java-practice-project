package LambdaExpressions;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdasInVariable {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(7);
        list.add(2);
        list.add(3);

        Consumer<Integer> method = n -> System.out.println(n);
        list.forEach(method);
    }
}
