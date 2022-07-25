class Solution {
  public int solution(int[] numbers) {
    int answer = 0;
    int sumUpTo10 = 45;
    int numbersSum = 0;

    for (int number : numbers) {
      numbersSum += number;
    }
    answer = sumUpTo10 - numbersSum;
    return answer;
  }
}