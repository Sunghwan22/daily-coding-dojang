class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        // 문자열을 섞어야 한다. 서로 번갈아 가면서 한 번씩 등장해야 한다

        for(int i =0; i < str1.length(); i += 1) {
            String word1 = String.valueOf(str1.charAt(i));
            String word2 = String.valueOf(str2.charAt(i));

            String word = word1 + word2;

            answer += word;
        }

        return answer;
    }
}
