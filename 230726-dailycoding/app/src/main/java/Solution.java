import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private Map<String, Integer> hashMap = new HashMap<>();
    private List<String> answerList = new ArrayList<>();

    public String[] solution(String[] orders, int[] course) {
        // 각 길이별로 가능한 모든 조합을 생성한다.
        // 코스 길이별 조합 생성
        // 가장 많은 조합을 저장한다.

        // order 정렬
        for(int i =0; i < orders.length; i += 1) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }

        // courseLength 만큼의 조합 만들기
        for(int courseLength : course) {
            for(String order : orders) {
                combination("", order, courseLength);
            }

            if(!hashMap.isEmpty()) {
                List<Integer> countList = new ArrayList<>(hashMap.values());
                int max = Collections.max(countList);

                if(max > 1) {
                    for(String key : hashMap.keySet()) {
                        if(hashMap.get(key) == max) {
                            answerList.add(key);
                        }
                    }
                }
            }
        }



        // 가장 많은 좋바을 answer에 저장한다.

        HashMap<String , Integer> map = new HashMap<>();

        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];

        for(int i =0; i < answer.length; i += 1) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private void combination(String order, String others, int courseLength) {
        if(courseLength == 0) {
            hashMap.put(order, hashMap.getOrDefault(order, 0) + 1);
            return;
        }

        for(int i =0; i < others.length(); i += 1) {
            combination(order + others.charAt(i), others.substring(i + 1), courseLength - 1);
        }
    }
}
