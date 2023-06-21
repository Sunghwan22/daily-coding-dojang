public class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder stringBuilder = new StringBuilder(my_string);

        for(int i = 0; i < queries.length; i += 1) {
            int[] each =  queries[i];

            int start = each[0];
            int end = each[1];

            String subString = my_string.substring(start, end + 1);
            String reverseString = new StringBuilder(subString).reverse().toString();

            stringBuilder.replace(start, end + 1, reverseString);
            my_string = stringBuilder.toString();
        }

        return my_string;
    }
}
