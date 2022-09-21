// n개 숫자들의 최소공배수 구하기
// 두 개의 숫자 a와 b의 최소공배수는 a * b을 a b의 최대공약수로 나눈 것과 같다
// 2개의 최소 공배수를 구한뒤에 앞에 2개의 최소 공배수와 다음 숫자와 다시 공배수를 구함

class Solution {
  public int solution(int[] arr) {
    int answer = 0;
    //  배열의 길이가 1일 때는 그대로 리턴
    if (arr.length == 1) {
      return arr[0];
    }

    int bigDivisor = greatestCommonDivisor(arr[0], arr[1]);
    answer = arr[0] * arr[1] / bigDivisor;

    if (arr.length > 2) {
      for (int i = 2; i < arr.length; i += 1) {
        bigDivisor = greatestCommonDivisor(answer , arr[i]);
        answer = (answer * arr[i]) / bigDivisor;
      }
    }

    return answer;
  }
 // 최대 공약수 구하기
  public int greatestCommonDivisor(int a, int b) {
    int rest = a % b;
    if (rest == 0) {
      return b;
    }

    if (rest != 0) {
      return greatestCommonDivisor(b, rest);
    }

    return 0;
  }
}
