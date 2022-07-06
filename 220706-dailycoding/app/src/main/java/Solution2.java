public class Solution2 {
  public long solution(long n) {
    long answer = -1;

    long squareRoot = getSquareRoot(n);

    if (n == Math.pow(squareRoot, 2)) {
      answer = (long) Math.pow(squareRoot + 1, 2);
      return answer;

    }
    return answer;
  }
  public long getSquareRoot(long n) {
    long squareRoot = (long) Math.sqrt(n);
    return squareRoot;
  }
}

