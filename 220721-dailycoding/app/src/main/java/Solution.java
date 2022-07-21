import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
  public int solution(int n) {
    int answer = 0;
    List<Integer> tenarys = new ArrayList<>();

    while(n != 0){
      int tenary = n%3;
      tenarys.add(tenary);
      n = n / 3;
    }
    Collections.reverse(tenarys);

    for(int i = 0; i<tenarys.size(); i+=1){
      answer += tenarys.get(i) * Math.pow(3,i);
    }
    return answer;
  }
}
