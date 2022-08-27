import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void convertNumber() {
    Solution solution = new Solution();

    String temp = solution.changeString("one");

    assertEquals("1", temp);
  }

  @Test
  void convertNumberWithNumber() {
    Solution solution = new Solution();

    String temp = solution.changeString("one2two3three");

    assertEquals("12233", temp);
  }

  @Test
  void sample() {
    Solution solution = new Solution();

    String temp1 = solution.changeString("one4seveneight");
    String temp2 = solution.changeString("23four5six7");
    String temp3 = solution.changeString("2three45sixseven");

    assertEquals("1478", temp1);
    assertEquals("234567", temp2);
    assertEquals("234567", temp3);
  }

  @Test
  void onlyNumber() {
    Solution solution = new Solution();

    String temp1 = solution.changeString("12345");
    String temp2 = solution.changeString("9573");

    assertEquals("12345", temp1);
    assertEquals("9573", temp2);
  }

  @Test
  void answer() {
    Solution solution = new Solution();

    int temp1 = solution.solution("12345");
    int temp2 = solution.solution("9573");

    assertEquals(12345, temp1);
    assertEquals(9573, temp2);
  }
}
