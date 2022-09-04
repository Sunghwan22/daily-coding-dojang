import java.util.ArrayList;
import java.util.List;
// [0,0,0,0,0]
// [0,0,1,0,3]
// [0,2,5,0,1]
// [4,2,4,4,2]
// [3,5,1,3,1]  1,5,3,5,1,2,1,4   4,3,1,1,3,2,4 4번이랑 3번이 2개씩사라져서 4개사라짐
// 숫자는 인형의 종류를 의미한다.
// 크레인이 집은 곳에 아무것도 없으면 아무일도 일어나지 않는다. 세로 가로

public class Solution {
  public int solution(int[][] board, int[] moves) {
    int length = board.length;

    List<Integer> pickedThings = new ArrayList<>();

    int removedCount = 0;

    // 픽 하기
    for (int column : moves) {
      for (int i = 0; i < length; i += 1) {
        int picked = board[i][column - 1];

        if (picked != 0) {
          pickedThings.add(picked);
          // 집은 친구는 없애야 하니까 0으로
          board[i][column - 1] = 0;
          // 그리고 반복문을 탈출하고 짬통에 추가를 해야함
          break;
        }
      }
      // 집은 친구의 마지막끼리 비교를 해야하기 때문에 - 1
      int lastIndex = pickedThings.size() - 1;

      //집어서 짬통에 넣은 친구가 있고 짬통에 마지막친구랑 마지막 -1 친구랑 같으면 2개 삭제하기
      if (lastIndex >= 1 && pickedThings.get(lastIndex).equals(
          pickedThings.get(lastIndex - 1))) {
        pickedThings.remove(lastIndex);
        lastIndex -= 1;
        pickedThings.remove(lastIndex);

        removedCount += 2;
      }
    }
    return removedCount;
  }
}
