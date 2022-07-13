import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {
  @Test
  void exampleTest() {
    Budget budget = new Budget();

    assertEquals(3, budget.solution(new int[]{1,3,2,5,4}, 9));
    assertEquals(4, budget.solution(new int[]{2,2,3,3}, 10));
    assertEquals(4, budget.solution(new int[]{5,4,3,2,1}, 13));
    assertEquals(5, budget.solution(new int[]{5,4,3,2,1}, 15));
  }

}