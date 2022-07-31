import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
  public int[] solution(String[] id_list, String[] report, int k) {
      int[] answer = new int[id_list.length];
      // key는 유저의 아이디 , value는 key를 신고한 유저아이디의 해쉬 코드를 가진 map이다
      Map<String, HashSet<String>> map = new HashMap<>();
      Map<String, Integer> reportUser  = new HashMap<>();

      // map을 initialinze시켜줌
      for(int i =0; i< id_list.length; i+=1){
        String name = id_list[i];
        map.put(name, new HashSet<>());
        reportUser.put(name,i);
      }

      for(String reporter : report){
        //신고 당한사람과 신고한 사람이 " "로 구분되기 떄문에 split사용
        String[] words = reporter.split(" ");
        String from = words[0];
        String to = words[1];
        //map에(key value둘다인가?) 신고한 당한사람과 신고한 사람 저장
        map.get(to).add(from);
      }

      for(int i =0; i< id_list.length; i+=1){
        //신고한 사람람
         HashSet<String> send = map.get(id_list[i]);
         if(send.size() >= k){
           for (String name : send) {
             answer[i] += reportUser.get(name);
           }
         }
      }
    return answer;
  }
}
