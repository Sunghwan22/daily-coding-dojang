import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals(4, solution.solution(15));
  }

  @Test
  void startWithNumber1() {
    Solution solution = new Solution();

    assertEquals(2, solution.solution(15));
  }
}
