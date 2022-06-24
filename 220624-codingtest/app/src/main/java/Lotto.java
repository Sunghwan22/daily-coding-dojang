public class Lotto {
  public int[] solution(int[] lottos, int[] win_nums) {

    int[] answer = new int[2];
    int notRecognizeNumber = 0;
    int rank = 0;

    for (int lotto : lottos) {
      if (lotto == 0) {
        notRecognizeNumber += 1;
      }
      for (int win_num : win_nums) {
        if (lotto == win_num) {
          rank += 1;
        }
      }
    }
    answer[0] = rank + notRecognizeNumber > 1 ? 7 - (rank + notRecognizeNumber) : 6;
    answer[1] = rank > 1 ? 7 - rank : 6;
    return answer;
  }
}
