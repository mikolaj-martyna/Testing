package pl.umcs;

public class TriangleArea {
    public static double calculate(double a, double b, double c) {
        if ((a <= 0 || b <= 0 || c <= 0) || (a + b <= c || a + c <= b || b + c <= a)) {
            throw new IllegalArgumentException();
        }

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
