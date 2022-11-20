import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        LinkedList<String> cache = new LinkedList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        answer = Arrays.stream(cities)
            .map(String::toUpperCase)
            .map(city -> {

                if (cache.remove(city)) {
                    cache.addFirst(city);
                    return 1;
                }

                if (cache.size() == cacheSize) {
                    cache.pollLast();
                }

                cache.addFirst(city);
                return 5;
            })
            .reduce(0, Integer::sum);

        return answer;
    }
}
