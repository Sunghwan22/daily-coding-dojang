import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();

        Map<String, Integer> termsDate = new HashMap<>();

        int thisYear = Integer.parseInt(today.split("\\.")[0]);
        String thisMonth = today.split("\\.")[1];
        String thisDay = today.split("\\.")[2];

        int thisDate = Integer.parseInt(thisMonth) * 28 + Integer.parseInt(thisDay);

        if ((Integer.parseInt(thisMonth) == 1)) {
            thisDate = Integer.parseInt(thisDay);
        }

        for (String term : terms) {
            String kind = term.split(" ")[0];
            int date = Integer.parseInt(term.split(" ")[1]) * 28;

            termsDate.put(kind, date);
        }

        for (int i = 0; i < privacies.length; i += 1) {
            int privaciesYear = Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[0]);
            String privaciesMonth = privacies[i].split(" ")[0].split("\\.")[1];
            String privaciesDay = privacies[i].split(" ")[0].split("\\.")[2];

            String termType = privacies[i].split(" ")[1];

            int privaciesDate = (Integer.parseInt(privaciesMonth) * 28) + Integer.parseInt(privaciesDay);


            if ((Integer.parseInt(privaciesMonth) == 1)) {
                privaciesDate = Integer.parseInt(privaciesDay);
            }
            // 만료날짜
            int overDate = privaciesDate + termsDate.get(termType);

            if (overDate >= 336) {
                privaciesYear += 1;
                overDate = overDate - 336;
            }

            if (privaciesYear < thisYear) {
                answerList.add(i + 1);
            }

            if (privaciesYear == thisYear && thisDate > overDate) {
                answerList.add(i + 1);
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i += 1) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}