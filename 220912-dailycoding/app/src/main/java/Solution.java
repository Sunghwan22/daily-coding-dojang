//각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
//신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
//한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
//k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
//유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.

// 동일한 유저에 대한 신고 횟수는 1회로 처리 중복이 안된다. HashSet을 사용하면 될 것 같음.
// k번 이상 신고된 유저는 정지되고 메일이 발송된다.
// return 값은 유저가 신고한 id와 정지한 아이디를 비교해서 정지당한아이디가 있으면 카운트가 올라감
// example
// "muzi"	["frodo", "neo"]	["frodo", "neo"] 2
//"frodo"	["neo"]	["neo"] 1
//"apeach"	["muzi", "frodo"]	["frodo"] 1
//"neo"	없음	없음 0

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {
  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];
    // 같은 유저가 여러번 신고하는 건 1회로 간주하기 때문에 set을 사용하자 중복제거
    HashSet<String> reportSet = new HashSet<>(List.of(report));
    // key는 신고한당한놈 value는 신고당한 횟수
    HashMap<String, Integer> reportedCount = new HashMap<>();

    //  맵을 일단 초기화하고 다시 신고당한 횟수를 구하자
    for (String user_id: id_list) {
      reportedCount.put(user_id, 0);
    }

    for (String i: reportSet) {
      reportedCount.put(i.split(" ")[1], reportedCount.get(i.split(" ")[1]) + 1);
    }

    for (String i: reportSet) {
      if (reportedCount.get(i.split(" ")[1]) >= k) {
        answer[Arrays.asList(id_list).indexOf(i.split(" ")[0])] += 1;
      }
    }

    return answer;
  }
}
