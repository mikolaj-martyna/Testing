package pl.umcs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

  @Test
  void calculateAllCorrect_returnsArea() {
    Assertions.assertEquals(6, TriangleArea.calculate(3, 4, 5));
    Assertions.assertEquals(6, TriangleArea.calculate(4, 5, 3));
    Assertions.assertEquals(6, TriangleArea.calculate(5, 3, 4));
  }

  @Test
  void calculateOneZero_throwsIllegalArgumentException() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(0, 3, 5));
    Assertions.assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(7, 0, 5));
    Assertions.assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(7, 3, 0));
  }

  @Test
  void calculateOneNegative_throwsIllegalArgumentException() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(-7, 3, 5));
    Assertions.assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(7, -3, 5));
    Assertions.assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculate(7, 3, -5));
  }
}
