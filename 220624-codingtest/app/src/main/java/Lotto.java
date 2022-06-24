public class Lotto {
  public int[] solution(int[] lottos, int[] win_nums) {
    lottos = new int[]{44, 1, 0, 0, 31, 25};
    win_nums = new int[]{31,10,45,1,6,19};

    int rank = 6;

    for(int i = 0; i< lottos.length; i+=1){
      for(int j = 0; j< win_nums.length; j+=1){
        if(lottos[i] == win_nums[j]){
            rank -= 1;
        }
      }
    }
    return new int[]{rank};
  }
}

