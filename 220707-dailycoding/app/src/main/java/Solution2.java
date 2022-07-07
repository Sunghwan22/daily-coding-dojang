import java.util.ArrayList;
import java.util.List;

public class Solution2 {
  public int solution(int n) {
    List<Integer> divide = new ArrayList<>();

    for (int i = 1; i < n; i += 1) {
      divide.add(i);
    }
    int answer = divide.stream().filter(j -> n % j == 1).findFirst().orElse(0);
    return answer;
  }
}

