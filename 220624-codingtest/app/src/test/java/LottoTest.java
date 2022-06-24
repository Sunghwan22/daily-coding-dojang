import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoTest {


  @Test
  void rank1() {
    Lotto lotto = new Lotto();

    int[] lottos = new int[]{44, 1, 0, 0, 31, 25};
    int[] win_nums = new int[]{31, 10, 45, 1, 6, 19};
    int[] rank = new int[]{3, 5};

    assertArrayEquals(rank, lotto.solution(lottos, win_nums));

  }

  @Test
  void rank2() {
    Lotto lotto = new Lotto();

    int[] lottos = new int[]{0, 0, 0, 0, 0, 0};
    int[] win_nums = new int[]{38, 19, 20, 40, 15, 25};
    int[] rank = new int[]{1, 6};

    assertArrayEquals(rank, lotto.solution(lottos, win_nums));
  }

  @Test
  void rank3() {
    Lotto lotto = new Lotto();

    int[] lottos = new int[]{45, 4, 35, 20, 3, 9};
    int[] win_nums = new int[]{20, 9, 3, 45, 4, 35};
    int[] rank = new int[]{1, 1};

    assertArrayEquals(rank, lotto.solution(lottos, win_nums));
  }
}
