import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution  = new Solution();

    assertTrue(solution.solution("()()"));
    assertTrue(solution.solution("(())()"));

    assertFalse(solution.solution(")()("));
    assertFalse(solution.solution("(()("));
  }

  @Test
  void stringWithOddNumber() {
    Solution solution = new Solution();

    assertFalse(solution.solution("()("));
    assertFalse(solution.solution("()))("));
    assertFalse(solution.solution("()()("));
  }
}
