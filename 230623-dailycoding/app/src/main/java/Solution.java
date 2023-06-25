import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int solution(int[] people, int limit) {
        int[] sortByWeight = sortByWeight(people);

        int first = 0;
        int last = people.length - 1;
        int answer = 0;

        for(int i = last; last >= first; last -= 1) {
            if(sortByWeight[first] + sortByWeight[last] <= limit) {
                first += 1;
            }

            answer += 1;
        }

        return answer;
    }

    private int[] sortByWeight(int[] people) {
        return Arrays.stream(people).sorted().toArray();
    }
}