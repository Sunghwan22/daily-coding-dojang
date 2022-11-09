// 마지막에서 부터 더해가는 식으로 하는 것이구나
//

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int[] sortByArray = sortByWeight(people);

        int answer = 0;

        int first = 0;

        for (int last = sortByArray.length - 1; last >= first; last -= 1) {
            if (sortByArray[last] + sortByArray[first] <= limit) {
                first += 1;
            }
            answer += 1;
        }
        return answer;
    }

    public int[] sortByWeight(int[] people) {
        return Arrays.stream(people).sorted().toArray();
    }
}