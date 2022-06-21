package codingdojang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScalarProductTest {
  @Test
  void simpleTest() {
    ScalarProduct scalarProduct = new ScalarProduct();

    assertEquals(3, scalarProduct.solution(new int[]{1, 2, 3, 4},
        new int[]{-3, -1, 0, 2}));

    assertEquals(-2, scalarProduct.solution(new int[]{-1, 0, 1},
        new int[]{1, 0, -1}));
  }


}