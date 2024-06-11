package pl.umcs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void addTwoPositive_returnsPositiveSum() {
    Assertions.assertEquals(5, Calculator.add(2, 3));
  }

  @Test
  void addTwoNegative_returnsNegativeSum() {
    Assertions.assertEquals(-5, Calculator.add(-2, -3));
  }

  @Test
  void addMixed_returnsPositiveSum() {
    Assertions.assertEquals(4, Calculator.add(7, -3));
  }

  @Test
  void addMixed_returnsNegativeSum() {
    Assertions.assertEquals(-4, Calculator.add(3, -7));
  }

  @Test
  void addTwoZero_returnsZeroSum() {
    Assertions.assertEquals(0, Calculator.add(0, 0));
  }

  @Test
  void addToZero_returnsFirstArg() {
    Assertions.assertEquals(5, Calculator.add(0, 5));
    Assertions.assertEquals(5, Calculator.add(5, 0));
  }

  @Test
  void subtractTwoPositive_returnsSubtractedPositive() {
    Assertions.assertEquals(2, Calculator.subtract(5, 3));
  }

  @Test
  void subtractTwoPositive_returnsSubtractedNegative() {
    Assertions.assertEquals(-2, Calculator.subtract(3, 5));
  }

  @Test
  void subtractTwoNegative_returnsSubtractedPositive() {
    Assertions.assertEquals(2, Calculator.subtract(-3, -5));
  }

  @Test
  void subtractTwoNegative_returnsSubtractedNegative() {
    Assertions.assertEquals(-2, Calculator.subtract(-5, -3));
  }

  @Test
  void multiplyTwoPositive_returnsMultipliedPositive() {
    Assertions.assertEquals(15, Calculator.multiply(5, 3));
  }

  @Test
  void multiplyTwoNegative_returnsMultipliedPositive() {
    Assertions.assertEquals(15, Calculator.multiply(-5, -3));
  }

  @Test
  void multiplyMixed_returnsMultipliedNegative() {
    Assertions.assertEquals(-15, Calculator.multiply(-5, 3));
    Assertions.assertEquals(-15, Calculator.multiply(5, -3));
  }

  @Test
  void multiplyByZero_returnsZero() {
    Assertions.assertEquals(0, Calculator.multiply(5, 0));
    Assertions.assertEquals(0, Calculator.multiply(0, 5));
  }

  @Test
  void divideTwoPositive_returnsDividedPositive() {
    Assertions.assertEquals(2, Calculator.divide(6, 3));
  }

  @Test
  void divideTwoNegative_returnsDividedPositive() {
    Assertions.assertEquals(2, Calculator.divide(-6, -3));
  }

  @Test
  void divideMixed_returnsDividedNegative() {
    Assertions.assertEquals(-2, Calculator.divide(-6, 3));
    Assertions.assertEquals(-2, Calculator.divide(6, -3));
  }

  @Test
  void divideByZero_throwsArithmeticException() {
    Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
  }
}
