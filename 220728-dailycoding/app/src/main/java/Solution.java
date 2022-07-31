import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public int solution(int n, int[] lost, int[] reserve) {
    Arrays.sort(lost);
    Arrays.sort(reserve);

    n -= lost.length;

    List<Integer> losts = new ArrayList<>();
    List<Integer> reserves = new ArrayList<>();

    for (int lostNumber : lost) {
      losts.add(lostNumber);
    }

    for (int reserveNumber : reserve) {
      reserves.add(reserveNumber);
    }

    for (int i = 0; i < losts.size(); i += 1) {
      for (int j = 0; j < reserves.size(); j += 1) {
        if (losts.get(i) == reserves.get(j)) {
          losts.remove(i);
          reserves.remove(j);
          n += 1;
          i -= 1;
          break;
        }
      }
    }

    for (int i = 0; i < losts.size(); i += 1) {
      for (int j = 0; j < reserves.size(); j += 1) {
        if (reserves.get(j) == losts.get(i) + 1 ||
            reserves.get(j) == losts.get(i) - 1) {

          losts.remove(i);
          reserves.remove(j);
          n += 1;
          i -= 1;
          break;
        }
      }
    }
    return n;
  }
}
