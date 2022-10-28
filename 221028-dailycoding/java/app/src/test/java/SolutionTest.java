import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void binaryCount() {
    Solution solution = new Solution();

    assertEquals(4, solution.binaryCount(78));
  }

  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals(83, solution.solution(78));
    assertEquals(23, solution.solution(15));
  }
}
