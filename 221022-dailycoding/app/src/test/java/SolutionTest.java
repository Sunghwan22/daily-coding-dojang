import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertArrayEquals(new int[]{3,8}, solution.solution("110010101001"));
  }

//  @Test
//  void removeZero() {
//    Solution solution = new Solution();
//
//    assertEquals(1111, solution.removeZero("0111010"));
//  }
//
//  @Test
//  void numberCount() {
//    Solution solution = new Solution();
//
//    assertEquals(3, solution.zeroCount("0111010"));
//  }
}
