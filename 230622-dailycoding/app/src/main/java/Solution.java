    import java.util.HashMap;
    import java.util.Map;

    class Solution {
        public int solution(String name) {
           int totalMoveCount = 0;
           int number = name.length();

           for(char c : name.toCharArray()) {
                totalMoveCount += countAlphabetMove(c);
           }

           int minMoveCount = number - 1;

           for(int i = 0 ; i< name.length(); i += 1) {
               int nextIndex = i + 1;

               // 연속된 'A' 가 나올 경우 이동 횟수를 줄인다.
               while (nextIndex < number && name.charAt(nextIndex) == 'A') {
                   nextIndex += 1;
               }

               minMoveCount = Math.min(minMoveCount, i + i + number - nextIndex);
           }

           totalMoveCount += minMoveCount;
            return totalMoveCount;
        }

        private int countAlphabetMove(char c) {
            return Math.min(c - 'A' , 'Z' - c + 1);
        }
    }
