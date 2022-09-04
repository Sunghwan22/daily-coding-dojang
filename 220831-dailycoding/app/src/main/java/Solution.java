//점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
// 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
// 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. +1 -1 까지만 빌려줄 수 있다.
// 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
//
//전체 학생의 수 n,
// 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
// 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
// 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
        if (Objects.equals(reserves.get(j), losts.get(i))) {
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
