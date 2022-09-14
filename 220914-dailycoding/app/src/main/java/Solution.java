class Solution {
  public int[] solution(int[] lottos, int[] win_nums) {

    int[] answer = new int[2];

    int highRank = highRank(lottos, win_nums);
    int leastRank = leastNumber(lottos, win_nums);

    answer[0] = highRank;
    answer[1] = leastRank;

    return answer;
  }

  public int leastNumber(int[] lottos, int[] winNumber) {
    int rank = 0;

    for (int i = 0; i < lottos.length; i += 1) {
      for(int j = 0; j < winNumber.length; j +=1) {
        if(lottos[i] == winNumber[j]) {
          rank += 1;
        }
      }
    }
    return rank > 1 ? 7 - rank : 6;
  }

  public int highRank(int[] lottos,  int[] winNumber) {
    int notRecognizeNumber = 0;
    int rank = 0;

    for (int lotto : lottos) {
      if (lotto == 0) {
        notRecognizeNumber += 1;
      }
      for (int win_num : winNumber) {
        if (lotto == win_num) {
          rank += 1;
        }
      }
    }
    return rank + notRecognizeNumber > 1 ? 7 - (rank + notRecognizeNumber) : 6;
  }
}
