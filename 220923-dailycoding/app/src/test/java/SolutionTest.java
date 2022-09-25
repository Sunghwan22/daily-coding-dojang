import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest extends TestCase {
  @Test
  void solution() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0},
        solution.solution(5, new int[]{2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}));

    assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        solution.solution(1, new int[]{-1}));
  }
}
