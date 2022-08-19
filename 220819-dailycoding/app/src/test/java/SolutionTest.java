import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution = new Solution();

    assertEquals("BC", solution.solution("AB",1));
    // 현재 z 다음에는 { 임 그러니까 a로 돌아가려면 -26을 해줘야ㅣ
    assertEquals("a", solution.solution("z",1));
    assertEquals("e F d", solution.solution("a B z",4));
  }
}
