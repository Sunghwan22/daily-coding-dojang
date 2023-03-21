class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int card1Index = 0;
        int card2Index = 0;

        for (int i = 0; i < goal.length; i += 1) {
            if (card1Index < cards1.length && goal[i].equals(cards1[i])) {
                card1Index += 1;
                continue;
            }

            if (card2Index < cards2.length && goal[i].equals(cards2[i])) {
                card2Index += 1;
                continue;
            }

            answer = "No";
            return answer;
        }

        return answer;
    }
}
