package dailycoding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashadNumber2Test {
  @Test
  void digitSum() {
    int x = 18;
    int sum = 0;

    while (x != 0) {
      sum += x % 10;
      x /= 10;
    }

    assertEquals(9, sum);
  }
  @Test
  void sampleTest() {
    HashadNumber hashadNumber = new HashadNumber();

    Assertions.assertTrue(hashadNumber.solution(10));
    Assertions.assertTrue(hashadNumber.solution(18));
    Assertions.assertFalse(hashadNumber.solution(11));
    Assertions.assertFalse(hashadNumber.solution(13));

  }
}

