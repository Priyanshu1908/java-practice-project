package LambdaExpressions;

import java.util.*;

public class SimpleLambdaExpression {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(8);
        list.add(4);

        list.forEach(n -> System.out.println(n));
    }
}
