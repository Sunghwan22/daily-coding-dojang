package dailycoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void simpleTest() {
    Solution solution = new Solution();

    assertEquals(9, solution.solution(9));
    assertEquals(7, solution.solution(7));
  }
  @Test
  void sampleTest() {
    Solution solution = new Solution();

    assertEquals(6, solution.solution(123));
    assertEquals(24, solution.solution(987));
  }
}