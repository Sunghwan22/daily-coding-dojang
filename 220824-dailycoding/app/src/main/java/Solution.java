
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 일단은 1 2 3 번 수포자들의 정답을 가지고 있는 배열이 필요함
// 1,2,3번들의 정답수를 가지고 있는 배열 필요
// 자 그러면 answers의 길이만큼 1 2 3 번들이 찍은 배열을 늘려줘야하는데
// 아니지 늘릴 필요가 굳이 없을 것 같기도하고
class Solution {
  public int[] solution(int[] answers) {
    int[] person1 = {1, 2, 3, 4, 5};
    int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int[] scores = {0, 0, 0};

    for (int i = 0; i < answers.length; i += 1) {
      if (answers[i] == person1[i % 5]) {
        scores[0] += 1;
      }
      if (answers[i] == person2[i % 8]) {
        scores[1] += 1;
      }
      if (answers[i] == person3[i % 10]) {
        scores[2] += 1;
      }
    }

    int highScore = Arrays.stream(scores).max().getAsInt();

    List<Integer> highScorePeoples = new ArrayList<>();

    for (int i = 0; i < 3; i+=1) {
      if(highScore == scores[i]) {
        highScorePeoples.add(i + 1);
      }
    }

    Collections.sort(highScorePeoples);

    answer = new int[highScorePeoples.size()];

    for(int i =0; i<highScorePeoples.size(); i+=1) {
      answer[i] = highScorePeoples.get(i);
    }

    return answer;
  }
}
