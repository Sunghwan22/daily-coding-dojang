import java.util.Arrays;

public class Budget {
  public int solution(int[] d, int budget) {
    int answer = 0;
    int totalAmount = 0;
    // 배열을 오름차순으로 정렬을 해주면 어떨까
    Arrays.sort(d);

    // 오름 차순으로 정렬 해준 배열에 반복문을 통해서 값을 쌓아주기
    for(int i =0; i< d.length; i+=1){
      totalAmount += d[i];
      // 반복문을 돌다 n번째 값을 더 했을때 총합이 더 커지면 break i는 0부터시작하니까 초과하게된
      // 값을 더해줘도 알맞은 값이 나온다 근데 문제 예시처럼 예산이랑 딱 맞아 떨어지거나 작은경우에
      // answer에 할당해줘야 하는 값은? !!!!어차피 다 돌았으니까 length
      if(totalAmount > budget){
        answer = i;
        break;
      }
    }
    if(totalAmount <= budget){
      answer = d.length;
    }
    return answer;
  }
}
