import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals(2, solution.solution(4));
  }

  @Test
  void possible() {
    Solution solution = new Solution();

    assertFalse(solution.possible(1));
  }
}
