/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dailycoding;

import java.util.Arrays;

public class Solution {
  public int[] solution(int[] arr) {
    int[] answer = {};

    int lowestNumber = arr[0];

    if (arr.length == 1) {
      answer = new int[]{-1};
      return answer;
    }

    answer = new int[arr.length - 1];
    int count = 0;
    //가장 작은 수 찾기

    for (int i = 0; i < arr.length; i += 1) {
      if (lowestNumber > arr[i]) {
        lowestNumber = arr[i];
      }
    }
    for (int i = 0; i < arr.length; i += 1) {
      if (arr[i] > lowestNumber) {
        answer[count] = arr[i];
        count += 1;
      }
    }


    return answer;
  }
}
