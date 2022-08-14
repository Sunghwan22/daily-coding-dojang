public class Solution {
  public long solution(int price, int money, int count) {
    long answer = 0;
    long totalPrice = 0;

    for (int i = 1; i <= count; i += 1) {
      totalPrice += (long) price * i;
    }
    //부족한 금액만큼
    if(totalPrice > money){
      answer =  totalPrice - money;
    }
    if(totalPrice - money < 0){
      return 0;
    }

    return answer;
  }
}
