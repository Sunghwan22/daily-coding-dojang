import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public int[] solution(int[] arr, int divisor) {
    int[] answer = {};
    int remainder = 0;

    List<Integer> answers = new ArrayList<>();

    for (int i = 0; i < arr.length; i += 1) {
      remainder = arr[i] % divisor;
      if (remainder == 0) {
        answers.add(arr[i]);
      }
    }

    if (answers.size() == 0) {
      answer = new int[]{-1};
      return answer;
    }

    answer = new int[answers.size()];

    for (int i = 0; i < answers.size(); i += 1) {
      answer[i] += answers.get(i);
    }

    Arrays.sort(answer);

    return answer;
  }

  public int[] solution2(int[] array, int divisor) {
    int[] answer = Arrays.stream(array).filter(i -> i  % divisor == 0).toArray();

    if(answer.length == 0) {
      answer = new int[]{-1};
    }

    Arrays.sort(answer);

    return answer;
  }
}

