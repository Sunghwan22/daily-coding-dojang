import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
 @Test
  void squaredRoot() {
  Solution2 solution2 = new Solution2();

  assertEquals(5, solution2.getSquareRoot(25));
  assertEquals(10, solution2.getSquareRoot(100));
  assertEquals(11, solution2.getSquareRoot(121));
 }
 @Test
 void sampleTest() {
  Solution2 solution2 = new Solution2();

  assertEquals(144, solution2.solution(121));
  assertEquals(-1, solution2.solution(3));
 }

}