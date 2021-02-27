import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // делить на ноль нельзя
    BinaryOperator<Integer> devide = (x, y) -> x != 0 && y != 0 ? x / y: 0;
// Так же можно записать вот так
//    public int devide(int x, int y) {
//        if (x != 0 && y != 0) {
//            return x / y;
//        } else {
//            return 0;
//        }
//    }

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
