import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals(4000, solution.solution(new int[][]
        {{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
  }

}