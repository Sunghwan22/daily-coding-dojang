import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoTest {
  @Test
  void rank() {
    Lotto lotto = new Lotto();

    int[] lottos = new int[]{44, 1, 0, 0, 31, 25};
    int[] win_nums = new int[]{31, 10, 45, 1, 6, 19};
    int[] rank = {4};

    assertArrayEquals(rank , lotto.solution(lottos,win_nums) );

  }
  @Test
  void highRank() {
    Lotto lotto = new Lotto();

    int[] lottos = new int[]{44, 1, 0, 0, 31, 25};
    int[] win_nums = new int[]{31, 10, 45, 1, 6, 19};
    int[] rank = {4};

    assertArrayEquals(rank , lotto.solution(lottos,win_nums) );

  }
}