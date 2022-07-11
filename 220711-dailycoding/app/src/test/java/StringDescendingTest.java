import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringDescendingTest {
  @Test
  void descending() {
    StringDescending stringDescending = new StringDescending();


    assertEquals("gfedcbZ", stringDescending.solution("Zbcdefg"));
  }

}