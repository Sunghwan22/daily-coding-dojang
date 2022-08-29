// 한 명빼고는 모든 사람이 완주를 함 못한 사람은 한명
// 참가 선수와 완주선수 가 있는 배열이 주어짐
// map은 순서가 보장이 안되긴 함 for문을 써서
// map에 저장을 시키고 참가자 들을 compleetion이랑 비교해서

import java.util.Arrays;

class Solution {
  public String solution(String[] participant, String[] completion) {
    String answer = "";
    sortParcipant(participant, completion);

    for(int i = 0; i< participant.length; i+=1){
      if(!participant[i].equals(completion[i])){
        return participant[i];
      }
    }
    return answer;
  }

  private void sortParcipant(String[] participant, String[] completion) {
    Arrays.sort(participant);
    Arrays.sort(completion);
  }
}
