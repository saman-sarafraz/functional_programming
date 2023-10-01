package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    private static final Function<Integer, Integer> doubleValueFunction =
            value -> value * 2;
    private static final Function<Integer, Integer> incrementByOneFunction =
            value -> ++value;
    private static final BiFunction<Integer, Integer, Integer> multiplyFunction =
            (value1, value2) -> value1 * value2;

    public static void main(String[] args) {
        // Function: Accepts one argument and produces one result
        // Imperative approach
        System.out.println(doubleValue(3));

        // Declarative approach
        Integer doubleValueResult = doubleValueFunction.apply(3);
        System.out.println(doubleValueResult);
        Integer finalResult = incrementByOneFunction
                .apply(doubleValueResult);
        System.out.println(finalResult);

        Function<Integer, Integer> doubleValueAndIncrementByOne =
                doubleValueFunction.andThen(incrementByOneFunction);
        System.out.println(doubleValueAndIncrementByOne.apply(3));

        // BiFunction: Accepts two arguments and produces one result
        // Imperative approach
        System.out.println(multiply(3, 2));

        // Declarative approach
        System.out.println(multiplyFunction.apply(3, 2));
    }

    public static int doubleValue(int value) {
        return value * 2;
    }

    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }
}
