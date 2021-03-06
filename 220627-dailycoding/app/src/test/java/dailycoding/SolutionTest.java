/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dailycoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void example() {

    Solution solution = new Solution();

    assertArrayEquals(new int[]{4,3,2}, solution.solution(new int[]{4,3,2,1}));
    assertArrayEquals(new int[]{4,2,3}, solution.solution(new int[]{4,2,3,1}));
  }


  @Test
  void lengthequal1() {

    Solution solution = new Solution();

    assertArrayEquals(new int[]{-1}, solution.solution(new int[]{10}));
  }
}