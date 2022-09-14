import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {
  @Test
  void leastRank() {
    Solution solution = new Solution();

    int[] lottos = new int[]{44,1,0,0,31,25};
    int[] winNumber = new int[]{31,10,45,1,6,19};

    assertEquals(5, solution.leastNumber(lottos,winNumber) );
  }

  @Test
  void highRank() {
    Solution solution = new Solution();

    int[] lottos = new int[]{44,1,0,0,31,25};
    int[] winNumber = new int[]{31,10,45,1,6,19};

    assertEquals(3, solution.highRank(lottos,winNumber) );
  }

  @Test
  void example() {
    Solution solution = new Solution();

    int[] lottos = new int[]{44,1,0,0,31,25};
    int[] winNumber = new int[]{31,10,45,1,6,19};

    assertArrayEquals(new int[]{3,5}, solution.solution(lottos,winNumber) );
  }
}
