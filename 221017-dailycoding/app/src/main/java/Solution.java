// String이 " " 로 연결되있으니까 split " "자르기 배열을 반환
//  숫자 배열로 변환
// sort로 정렬한뒤에 첫번째가 최솟값 마지막이 최대값(length - 1)
// 그리고 minimin + " " + maxinmun 의 형태로 리턴하면 될듯 하다.

import java.util.Arrays;

class Solution {
  public String solution(String s) {
    int[] numbers = sortArray(s);

    int minimum = numbers[0];
    int maximum = numbers[numbers.length - 1];

    return minimum + " " + maximum;
  }

  public int[] sortArray(String s) {
    String[] array = s.split(" ");

    int[] intArray = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();

    Arrays.sort(intArray);

    return intArray;
  }
}