import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void sampleTest() {
    Solution solution =new Solution();

    assertEquals(144, solution.solution(121));
    assertEquals(-1 , solution.solution(3));
  }

}