import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals(1, solution.solution("baabaa"));
    assertEquals(0, solution.solution("cdcd"));
  }
}