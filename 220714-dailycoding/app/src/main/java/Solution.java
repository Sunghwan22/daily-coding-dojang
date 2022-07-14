import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int[] solution(int[] arr) {
    List<Integer> answerList = new ArrayList<>();
    int[] answer = {};

    answerList.add(arr[0]);

    for (int i = 1; i < arr.length; i += 1) {
      if (arr[i] != arr[i - 1]) {
        answerList.add(arr[i]);
      }
    }
    answer = new int[answerList.size()];

    for (int i = 0; i < answerList.size(); i += 1){
      answer[i] = answerList.get(i);
    }

      return answer;
  }
}
