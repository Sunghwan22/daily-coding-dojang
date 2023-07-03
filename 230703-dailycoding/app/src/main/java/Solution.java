import java.util.ArrayList;
import java.util.List;

public class Solution {
    // 1. 한 기능을 개발하는데 필요한 날짜 계산
    // 2. 함께 배포할 기능 계산
    // 3. 배포할 개수 계산하고 반복
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer= new ArrayList<>();

        for(int i =0; i < progresses.length; i += 1) {
            double days = (100 - progresses[i]) / (double) speeds[i];
            // days라는 실수형 값을 올림을 해서 int형으로 캐스팅을 한다.
            int daysUp = (int) Math.ceil(days);

            // 이러면은 처음에 95랑 1이 들어오니까 5일 이라는 값이 나온다

            // 함께 배포할 기능의 인덱스 찾기   // 현재 i가 0이니까
            // j= 1      즉 90 + 5 + 1 100보다 작으면은 반복문을 멈춰야 함
            int index = i + 1;
            for(int j = index; j < progresses.length; j += 1) {
                if(progresses[j] + daysUp + speeds[j] < 100) {
                    break;
                }

                // J - i의 이유는 멈췄으니까 저게 이제 안되겠지
                answer.add(j - i);
                // 그 다음에 i는 j의 값이 되야 하기 때문에 j - 1이다 i += 1이 있기 떄문에 -1
                // 을 해줌
                i = j - 1;
            }
        }

        int[] answerArray = new int[answer.size()];

        for(int i =0; i < answer.size(); i += 1) {
            answerArray[i] = answer.get(i);
        }

        return answerArray;
    }
}
