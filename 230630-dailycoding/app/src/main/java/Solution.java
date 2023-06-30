import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // (HashSet을 사용해서 report의 중복된 정보제거)
        // (Hash로 각 사용자를 신고한 사람들의 목록을 관리한다.)
        //  (정지된 사용를 신고한 사용자에게 알려주고 이 정보를 Hash로 정리

        int[] answer = new int[id_list.length];

        // 1. 중복제거
        HashSet<String> reportSet = new HashSet<>();
        reportSet.addAll(Arrays.asList(report));

        // 2. notifyListhash 만들기
        HashMap<String, List<String>> notifyListHash = new HashMap<>();

        for(String rep : reportSet) {
            int blankIndex = rep.indexOf(" ");
            // 신고한 사람
            String reporter = rep.substring(0, blankIndex);
            // 받은 사람
            String reportee = rep.substring(blankIndex + 1);

            // 신고한 사람들의 목록을 리스트 형태로 관리한다.
            // 해쉬의 키에는 신고받은 사람 밸류는 신고한 사람들의 목록이 있는 리스트 형태
            // null일 경우에 리스트를 새로 생성하고 리스트에 신고한 사람 추가
            // 그리고 나서 맵에다가 넣는다
            // 다음에 같은 이름이 나와도 null이 아니기 떄문에 reporter리스트에 애드를 한다.
            // 그 다음에 다시 해쉬맵에 추가를 한다.
            List<String> reporterList = notifyListHash.getOrDefault(reportee, null);
            if(reporterList == null) {
                reporterList = new ArrayList<>();
            }

            reporterList.add(reporter);
            notifyListHash.put(reportee, reporterList);
        }

        HashMap<String, Integer> reporterHash = new HashMap<>();

        for(List<String> notifyList : notifyListHash.values()) {
            if(notifyList.size() >= k) {
                for(String reporter : notifyList) {
                    reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);
                }
            }
        }

        for(int i =0; i < id_list.length; i += 1) {
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}
