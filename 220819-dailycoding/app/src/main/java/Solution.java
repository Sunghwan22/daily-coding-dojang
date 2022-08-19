public class Solution {
  public String solution(String input, int index) {
    String answer = "";

    for (int i = 0; i < input.length(); i += 1) {
      char word = input.charAt(i);

      if (word == ' ') {
        answer += word;
        continue;
      }

      char modified = (char) (word + index);
      // A Z사이의 범위인데 만약 index랑 word랑 더해서 Z의 숫자보다 크면 -26만큼 해준다ㅣ
      boolean isExceededLastIndexOfUpperCase
          = (word >= 'A' && word <= 'Z') && modified > 'Z';

      boolean isExceededLastIndexOfLowerCase
          = (word >= 'a' && word <= 'z') && modified > 'z';

      if (isExceededLastIndexOfUpperCase || isExceededLastIndexOfLowerCase) {
        modified -= 26;
      }

      answer += modified;
    }

    return answer;
  }
}