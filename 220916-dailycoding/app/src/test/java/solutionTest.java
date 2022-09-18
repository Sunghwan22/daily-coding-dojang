import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals("LRLLLRLLRRL", solution.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
    assertEquals("LRLLRRLLLRR", solution.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    assertEquals("LLRLLRLLRL", solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
  }

  @Test
  void pullWithLeftPad() {
    Solution solution = new Solution();

    assertEquals("LLL", solution.solution(new int[]{1, 4, 7}, "left"));
  }

  @Test
  void pullWithRightPad() {
    Solution solution = new Solution();

    assertEquals("RRR", solution.solution(new int[]{3, 6, 9}, "right"));
  }

  @Test
  void pullLeftAndRightPad() {
    Solution solution = new Solution();

    assertEquals("LRLLRR",
        solution.solution(new int[]{1, 3, 4, 7, 6, 9}, "right"));
  }

  @Test
  void pullCenterPad() {
    Solution solution = new Solution();

    assertEquals("LLRRR", solution.solution(new int[]{1, 2, 9, 8, 0}, "right"));
  }

  @Test
  void pullLeftHandZero() {
    Solution solution = new Solution();

    assertEquals("L", solution.solution(new int[]{0}, "left"));
  }

  @Test
  void pullRightHandZero() {
    Solution solution = new Solution();

    assertEquals("R", solution.solution(new int[]{0}, "right"));
  }
}