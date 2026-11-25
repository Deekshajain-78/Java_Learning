package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 45, 67, 87, 78);

        Stream<Integer> stream = list.stream();
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {

            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };

        BinaryOperator<Integer> binaryOperator2 = (a, b) -> a + b;
        int sum = stream.reduce(0, binaryOperator2);
        int sum2 = stream.reduce(0, (a, b) -> a + b);
        System.out.println(sum);

    }

}
