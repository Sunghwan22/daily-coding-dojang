public class Solution {
  public int solution(String str1, String str2) {
    int[][] arr1 = new int[27][27];
    int[][] arr2 = new int[27][27];

    String lowerCase = str1.toLowerCase();

    int length = lowerCase.length();
    for (int i = 1; i < length; i += 1) {
      if (lowerCase.charAt(i - 1) >= 'a' &&
          lowerCase.charAt(i - 1) <= 'z' &&
          lowerCase.charAt(i) >= 'a' &&
          lowerCase.charAt(i) <= 'z') {
        arr1[lowerCase.charAt(i - 1) - 97][lowerCase.charAt(i) - 97] += 1;
      }
    }
    lowerCase = str2.toLowerCase();
    length = lowerCase.length();

    for (int i = 1; i < length; i += 1) {
      if (lowerCase.charAt(i - 1) >= 'a'
          && lowerCase.charAt(i - 1) <= 'z'
          && lowerCase.charAt(i) >= 'a'
          && lowerCase.charAt(i) <= 'z') {
        arr2[lowerCase.charAt(i - 1) - 97][lowerCase.charAt(i) - 97] += 1;
      }
    }

    int sum = 0, dif = 0;
    for (int i = 0; i < 27; i += 1) {
      for (int j = 0; j < 27; j += 1) {
        sum += Math.max(arr1[i][j], arr2[i][j]);
        dif += Math.min(arr1[i][j], arr2[i][j]);
      }
    }
    if (sum == 0) return 65536;
    return (int) (65536.0 * dif / sum);
  }
}
