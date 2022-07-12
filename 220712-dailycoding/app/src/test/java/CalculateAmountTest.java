import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAmountTest {
  @Test
  void resultTest() {
    CalculateAmount calculateAmount = new CalculateAmount();

    assertEquals(10, calculateAmount.solution(3,20,4));
  }
}