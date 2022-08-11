import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int solution(int n) {
    List<Integer> divide = new ArrayList<>();

    for (int i = 1; i < n; i += 1) {
      divide.add(i);
    }

    return divide.stream().filter(i -> n % i == 1).findFirst().orElse(0);
  }
}
