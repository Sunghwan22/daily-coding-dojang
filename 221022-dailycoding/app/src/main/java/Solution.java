// x의 모든 0를 제거한다.
// x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
//x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.

// 1 -> 0을 ""로 변환한다.
// 0을 ""로 변환한 친구를 2진수로 바꾼다.
//
// 문제를 잘못이해해서 오래걸렸다. 문제를 자세히 보자

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(String s) {
    int[] answer = new int[2];

    while (s.length() > 1) {
      int countOne = 0;

      for (int i = 0; i < s.length(); i += 1) {
        if (s.charAt(i) == '0') {
          answer[1] += 1;
        }

        if (s.charAt(i) != '0') {
          countOne += 1;
        }
      }
      s = Integer.toBinaryString(countOne);

      answer[0] += 1;
    }

    return answer;
  }
}
