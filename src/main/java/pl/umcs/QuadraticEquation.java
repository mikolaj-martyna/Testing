package pl.umcs;

import java.util.HashSet;
import java.util.Set;

public class QuadraticEquation {
    public static Set<Double> solve(int a, int b, int c) {
    Set<Double> solution = new HashSet<>();
        double delta = b*b - 4*a*c;

        if (delta >= 0) {
            solution.add((-1 * b - Math.sqrt(delta)) / (2 * a));
            solution.add((-1 * b + Math.sqrt(delta)) / (2 * a));
        }

        return solution;
    }
}
