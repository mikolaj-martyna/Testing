package pl.umcs;

public class Calculator {
    public static long add(long a, long b) {
        return a + b;
    }

    public static long subtract(long a, long b) {
        return a - b;
    }

    public static long multiply(long a, long b) {
        return a * b;
    }

    public static long divide(long a, long b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }

        return a / b;
    }
}
