public class Solution {
  public long solution(long n) {
    long answer = 0;

    for (int i = 0; i <= n; i += 1) {
      if (n == Math.pow(i, 2)) {
        answer = (long) Math.pow(i + 1, 2);
        return answer;
      }
    }

    return -1;
  }
}

