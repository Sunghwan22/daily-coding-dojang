

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void solution() {
    Solution solution = new Solution();

    assertEquals(5, solution.solution(5, new int[]{2,4}, new int[]{1,3,5}));
    assertEquals(4,solution.solution(5, new int[]{2,4}, new int[]{3}));
    assertEquals(2, solution.solution(3, new int[]{3}, new int[]{1}));
  }

  @Test
  void repetition() {
    Solution solution = new Solution();

    assertEquals(5, solution.solution(5, new int[]{3,4}, new int[]{3,5}));
    assertEquals(10, solution.solution(10, new int[]{5,4,3,2,1}, new int[]{3,1,2,5,4}));
    assertEquals(6, solution.solution(12, new int[]{1,2,3,4,8,9,10,11}, new int[]{9,10}));
    assertEquals(2, solution.solution(3, new int[]{1,2}, new int[]{2,3}));
    assertEquals(8, solution.solution(9, new int[]{5,6,8,1,2}, new int[]{2,3,1,4,8,9}));
  }
}