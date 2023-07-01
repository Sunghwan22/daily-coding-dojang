import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] solution(String[] info, String[] query) {
        HashMap<String, List<Integer>> map = new HashMap<>();

        for(String i : info) {
            String[] data = i.split(" ");
            String[] languages = {data[0], ""};
            String[] positions = {data[1], ""};
            String[] experiences = {data[2], ""};
            String[] foods = {data[3], ""};
            int scores = Integer.parseInt(data[4]);

            for(String language : languages) {
                for(String position : positions) {
                    for(String experience : experiences) {
                        for(String food : foods) {
                            String[] keyData = {language, position, experience, food};
                            String key = String.join(" ", keyData);
                            List<Integer> arr = map.getOrDefault(key, new ArrayList<>());

                            arr.add(scores);
                            map.put(key, arr);
                        }
                    }
                }
            }
        }
        for(List<Integer> arr : map.values()) {
            arr.sort(null);
        }

        int[] answer = {query.length};
        int i = 0;

        for(String q : query) {
            String[] data = q.split(" and ");
            int target = Integer.parseInt(data[3].split(" ")[1]);
            data[3] = data[3].split(" ")[0];
            String key = String.join(" ", data);

            if(map.containsKey(key)) {
                List<Integer> list = map.get(key);
                int left = 0;
                int right = list.size();

                while (left < right) {
                    int mid = (left + right) / 2;
                    if(list.get(mid) >= target) {
                        right = mid;
                    }

                    if(list.get(mid) <= target) {
                        left = mid + 1;
                    }
                }

                answer[i] = list.size() - left;
            }

            i += 1;
        }


        return answer;
    }
}
