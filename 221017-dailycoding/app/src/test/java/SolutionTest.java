import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals("-1 2", solution.solution("-1 0 1 2"));
    assertEquals("1 4", solution.solution("1 2 3 4"));
    assertEquals("-4 -1", solution.solution("-1 -2 -3 -4"));
    assertEquals("-7 -3", solution.solution("-5 -3 -7 -4"));
  }

  @Test
  void sortArray() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{-1, 0, 1, 2}, solution.sortArray("-1 0 1 2"));
    assertArrayEquals(new int[]{1, 2, 3, 4}, solution.sortArray("1 2 3 4"));
    assertArrayEquals(new int[]{-4,-3,-2,-1}, solution.sortArray("-1 -2 -3 -4"));
  }
}
