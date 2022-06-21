package codingdojang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterMelonTest {

  @Test
  void name() {
    WaterMelon waterMelon = new WaterMelon();

    assertEquals("수박", waterMelon.solution(2));
  }
  @Test
  void over3Name() {
    WaterMelon waterMelon = new WaterMelon();

    assertEquals("수박수", waterMelon.solution(3));
    assertEquals("수박수박", waterMelon.solution(4));
    assertEquals("수박수박수박", waterMelon.solution(6));
  }




}