import java.util.Arrays;

public class Solution {
  public int solution(int[] d, int budget) {
    int answer = 0;
    int totalAmount = 0;

    Arrays.sort(d);

    for(int i=0; i< d.length; i+=1) {
      totalAmount += d[i];

      if(totalAmount > budget) {
        answer = i;
        break;
      }
    }
    if(totalAmount <= budget) {
      answer = d.length;
    }
    return answer;
  }
}
