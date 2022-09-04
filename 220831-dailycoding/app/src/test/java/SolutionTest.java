import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void solution() {
    Solution solution = new Solution();

    assertEquals(5, solution.solution(
        5, new int[]{2, 4}, new int[]{1, 3, 5}));
  }

  @Test
  void lostAndReserve() {
    Solution solution = new Solution();

    assertEquals(9, solution.solution(
        10, new int[]{1, 2, 5, 6, 9}, new int[]{1, 3, 5, 6}));
  }

  @Test
  void sort() {
    Solution solution = new Solution();

    assertEquals(4, solution.solution(
        4, new int[]{4, 2}, new int[]{3, 5}));
  }

  @Test
  void exception() {
    Solution solution = new Solution();

    assertEquals(4, solution.solution(
        5, new int[]{1, 2, 4}, new int[]{2, 4, 5}));
  }
}
