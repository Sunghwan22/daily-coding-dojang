package dailycoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void simpleTest() {
    Solution solution = new Solution();

    int[] test = {2, 4, 6, 8, 10};
    int[] test2 = {4, 8, 12};
    int[] test3 = {-4, -8};


    assertArrayEquals(test, solution.solution(2, 5));
    assertArrayEquals(test2, solution.solution(4, 3));
    assertArrayEquals(test3, solution.solution(-4, 2));
  }


}