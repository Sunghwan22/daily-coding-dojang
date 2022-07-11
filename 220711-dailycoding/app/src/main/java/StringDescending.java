import java.util.Arrays;

public class StringDescending {
  public String solution(String s) {
    String answer = "";
    String inputString = s;

    char[] inputStringToChar = inputString.toCharArray();

    // 배열을 오름차순으로 정렬
    Arrays.sort(inputStringToChar);

    //내림차순으로 정렬해주기
    for (int i = inputStringToChar.length - 1; i >= 0; i -= 1){
      answer += inputStringToChar[i];
    }

      return answer;
  }
}
