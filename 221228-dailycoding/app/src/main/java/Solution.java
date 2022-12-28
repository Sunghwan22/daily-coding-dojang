import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> size = new HashMap<>();

        for(int i = 0; i < tangerine.length; i +=1) {
            size.put(tangerine[i], size.getOrDefault(tangerine[i], 0) + 1);
        }

        List<Integer> keyList = new ArrayList<>(size.keySet());

        keyList.sort(((o1, o2) -> size.get(o2) - size.get(o1)));

        int i = 0;
        while(k > 0) {
            k -= size.get(keyList.get(i));
            answer += 1;
            i +=1;
        }

        return answer;

    }
}