import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int[] solution(int[] arr) {
    List<Integer> answers = new ArrayList<>();
    answers.add(arr[0]);

    for(int i=1; i< arr.length; i+=1) {
      if(arr[i] != arr[i - 1]) {
          answers.add(arr[i]);
      }
    }

    int [] answer = new int[answers.size()];

    for(int i =0; i< answer.length; i+=1) {
      answer[i] = answers.get(i);
    }

    return answer;
  }
}

