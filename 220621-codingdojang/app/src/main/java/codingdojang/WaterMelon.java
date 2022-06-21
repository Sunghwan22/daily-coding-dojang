package codingdojang;

public class WaterMelon {
  public String solution(int number) {
    String answer = "";

    for (int i = 0; i < number; i += 1) {
      if (i % 2 == 0) {
        answer += "수";
      }

      if (i % 2 == 1) {
        answer += "박";
      }
    }

    return answer;
  }
}
