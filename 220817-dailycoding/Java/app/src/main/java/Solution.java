import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
  public long solution(long n) {
    String answer = "0";

    String number = String.valueOf(n);

    List<String> answers = new ArrayList<>();

    for(int i =0; i<number.length(); i+=1) {
      answers.add(String.valueOf(number.charAt(i)));
    }

    Collections.sort(answers, Collections.reverseOrder());

    for(int i=0; i<answers.size(); i+=1) {
      answer += answers.get(i);
    }

    return Long.parseLong(answer);
  }
}
