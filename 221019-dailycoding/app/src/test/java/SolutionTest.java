import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void example() {
    Solution solution  = new Solution();

    assertEquals("3people Unfollowed Me", solution.solution("3people unFollowed Me"));
    assertEquals("For The Last Week", solution.solution("for the last week"));
  }

  @Test
  void toLowerCase() {
    Solution solution = new Solution();

    assertEquals(new String[]{"3people", "unfollowed", "me"}, solution.toLowerCase("3people unFollowed Me"));
  }
}