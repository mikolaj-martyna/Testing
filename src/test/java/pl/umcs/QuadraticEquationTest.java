package pl.umcs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

class QuadraticEquationTest {

  @Test
  void solvePositiveDelta_returnsTwoSolutions() {
    Set<Double> solutions = QuadraticEquation.solve(2, 5, 3);

    Assertions.assertEquals(2, solutions.size());
    Assertions.assertTrue(solutions.contains(-1.5));
    Assertions.assertTrue(solutions.contains(-1.0));
  }

  @Test
  void solveZeroDelta_returnsOneSolution() {
    Set<Double> solutions = QuadraticEquation.solve(1, 2, 1);

    Assertions.assertEquals(1, solutions.size());
    Assertions.assertTrue(solutions.contains(-1.0));
  }

  @Test
  void solveNegativeDelta_returnsZeroSolutions() {
    Set<Double> solutions = QuadraticEquation.solve(1, 3, 5);

    Assertions.assertEquals(0, solutions.size());
  }
}
