import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void solution() {
    Solution newsClustering = new Solution();

    assertEquals(16384, newsClustering.solution("FRANCE", "french"));
  }
}
