// 가장먼저 탈락하는 사람 번호를 어떻게 알까?

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] solution(int n, String[] words) {
    int[] answer = new int[2];

    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < words.length; i += 1) {
      if (i != 0) {
        String previousWord = words[i - 1];
        String currentWord = words[i];

        char lastCharacter = previousWord.charAt(previousWord.length() - 1);
        char firstCharacter = currentWord.charAt(0);

        if (map.containsKey(currentWord) || lastCharacter != firstCharacter) {
          answer[0] = (i % n) + 1; // 번호 구하기 4 % 2 + 1= 1
          answer[1] = (i / n) + 1; // 차례구하기 4 / 2  + 1 = 3
          return answer;
        }
      }
      map.put(words[i], 1);
    }

    return answer;
  }
}
