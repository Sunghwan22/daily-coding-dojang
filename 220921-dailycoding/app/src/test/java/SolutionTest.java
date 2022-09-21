import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals(168, solution.solution(new int[]{2, 6, 8, 14}));
    assertEquals(6, solution.solution(new int[]{1, 2, 3}));
  }

  @Test
  void arrayLength1() {
    Solution solution = new Solution();

    assertEquals(2, solution.solution(new int[]{2}));
    assertEquals(8, solution.solution(new int[]{8}));
  }

  @Test
  void greatestCommonDivisor() {
    Solution solution = new Solution();

    assertEquals(4, solution.greatestCommonDivisor(4, 8));
    assertEquals(6, solution.greatestCommonDivisor(12, 6));
  }
}