/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codingdojang;

public class ScalarProduct {
  public int solution(int[] a, int[] b) {
    int answer = 0;

    for (int i = 0; i < a.length; i += 1) {
      answer += a[i] * b[i];
    }


    return answer;
  }
}