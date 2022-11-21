class Solution {
    public long solution(int n) {
        if(n == 1) {
            return 1;
        }

        long[] dp = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i<= n; i +=1) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        // i 가 2면은 1 + 1 = 2
        // i 가 3이되면 2 + 1 = 3
        // i[4] = 3 + 2 = 5
        // i[5] = 5 + 3 = 8
        // i[6] = 8 + 5 = 13

        // 이게 어떻게 되는 거시여? 뭐고 이거 어캐 되는거야

        return dp[n];
    }
}