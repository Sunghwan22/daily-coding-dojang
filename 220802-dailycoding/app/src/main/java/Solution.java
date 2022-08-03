public class Solution {
  public int solution(int left, int right) {
    int answer =0;

    int divisorNumberCount = 0;
    for(int i = left; i <= right; i += 1) {
      for(int j = 1; j <= left; j += 1) {
        if(i % j == 0) {
          divisorNumberCount += 1;
        }
      }

      if(divisorNumberCount % 2 == 0) {
        answer += left;
      }

      if(divisorNumberCount % 2 != 0) {
        answer -= left;
      }

      divisorNumberCount = 0;
      left += 1;
    }

    return answer;
  }
}
