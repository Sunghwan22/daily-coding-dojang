// 퀸은 모든 방향으로 상하좌우 대각선으로 거리제한없이 이동이 가능하다.
// 가로 세로의 길이는 n
// 한번에 공격을 할 수 없는 방법을 리턴해라..
// 한번에 공격 할 수 없으려면 가로세로 대각선에 위치하면 안된다.
// 가로에 없는 거 확인을 하고
// 2차원배열 말고 1차원 배열로 압축을 한다?
// 배열의 index를 행 배열의 값을 열로
// 먼가 재귀같은 개념이 나와야 할 거 같은데
// 예시를 보면 1 , 3, 0 , 2 라는 값이 나오고
// 가로 세로 대각선이 겹치면안됨

// 가로 : 지금까지 놓여진말들의 값이 앞으로 놓일 값과 같으면 안된다
// 대각선 지금까지 놓여진말들의 행 열과 앞으로 놓일 행 열의 기울기가 동등하면 안된다?

public class Solution {
  private int count;
  private int[] board;

  public int solution(int n) {
    count = 0;
    board = new int[n];
    backTracking(n, 0);

    return count;
  }

  private void backTracking(int n, int row) {
    if (row == n) {
      count += 1;
      return;
    }

    for (int i = 0; i < n; i += 1) {
      board[row] = i;
      if (possible(row)) {
        backTracking(n, row + 1);
      }
    }
  }

  public boolean possible(int row) {

    for (int i = 0; i < row; i += 1) {
      if (board[i] == board[row]) {
        return false;
      }
// |기존 퀸의 행 - 배치할 퀸의 행| == |기존 퀸의 열 - 배치할 퀸의 열| = true ? 대각선에 있음 : 대각선아님
      if (Math.abs(row - i) == Math.abs(board[row] - board[i]))
        return false;
    }
    return true;
  }
}
