public class Solution {
  public int solution(int[][] sizes) {
    int row = 0;
    int column = 0;

    for(int i =0; i< sizes.length; i+=1) {
      int x = Math.max(sizes[i][0], sizes[i][1]);
      int y = Math.min(sizes[i][0], sizes[i][1]);

      row = Math.max(row, x);
      column = Math.max(column, y);
    }

    int answer =  row * column;
    return answer;
  }
}
