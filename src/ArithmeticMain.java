import Arithmetic.Arithmetic;
import java.util.Scanner;

public class ArithmeticMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        Number num1 = getNumber(scanner.next());

        System.out.print("Enter second number:");
        Number num2 = getNumber(scanner.next());

        Arithmetic<Number> arithmetic = new Arithmetic<>(num1, num2);

        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());

        try {
            System.out.println("Division: " + arithmetic.divide());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Minimum: " + arithmetic.getMin());
        System.out.println("Maximum: " + arithmetic.getMax());
    }

    private static Number getNumber(String input) {
        if (input.contains(".")) {
            return Double.valueOf(input);
        } else {
            return Integer.valueOf(input);
        }
    }
}