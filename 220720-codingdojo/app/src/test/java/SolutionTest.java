import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{3, 12}, solution.solution(3, 12));
    assertArrayEquals(new int[]{1, 10}, solution.solution(2, 5));
    assertArrayEquals(new int[]{4, 4}, solution.solution(4, 4));
    assertArrayEquals(new int[]{12, 240}, solution.solution(60, 48));
  }
}
