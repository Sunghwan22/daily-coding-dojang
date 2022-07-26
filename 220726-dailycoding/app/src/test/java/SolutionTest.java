import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals("leo", solution.solution(new String[]{"leo", "kiki", "eden"},
        new String[]{"eden", "kiki"}));
    assertEquals("vinko",solution.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
        new String[]{"josipa", "filipa", "marina", "nikola"}));
  }
}