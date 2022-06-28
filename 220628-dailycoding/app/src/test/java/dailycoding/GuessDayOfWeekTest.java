package dailycoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessDayOfWeekTest {
  @Test
  void dayOfWeek() {
    GuessDayOfWeek guessDayOfWeek = new GuessDayOfWeek();

    assertEquals("SAT", guessDayOfWeek.solution(1, 2));
    assertEquals("FRI", guessDayOfWeek.solution(1, 8));
    assertEquals("TUE" , guessDayOfWeek.solution(1,12));
  }
  @Test
  void sample() {
    GuessDayOfWeek guessDayOfWeek = new GuessDayOfWeek();

    assertEquals("TUE", guessDayOfWeek.solution(5, 24));
    assertEquals("FRI", guessDayOfWeek.solution(1, 8));
    assertEquals("TUE" , guessDayOfWeek.solution(1,12));
  }
}