import org.checkerframework.checker.units.qual.A;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    // 나도 와카 타임을 사용을 할까
    // 그 다음에 백엔드 커버리지를 86퍼센트를 달성했다 라고 하면은 되지 않을까
    // 아니면은 그거 머였더라 님아 일단은 저렇게 해보고 난 다음에 그걸 해야겠는데
    // 인털듀스로 시작을 한 다음에 그거를 해야하지 않을까 싶기도 합니다.
    // 일단은 나도 와카타임으로 시작을 한 다음엑 그거를 하는 게 낮겠지
    // 1. 와카타임으로 뭔가 꾸준함을 어필을 한다.
    // 2. 백엔드 테스트코드 커버리지를 어필한다.
    // 3. 객체지향과 TDD에 관심이 있다.
    // 이 3가지를 어필을 해야하는데 어떻게 어필을 할 수 있을까
    // 사람은 뭔가 일관성의 법칙이 있기 때문에 일단은 이렇게 해야한다.
    public String solution(String[] participant, String[] completion) {
        String[] answer = new String[1];

        String unfinishedPeople = sort(participant, completion);

        answer[0] = unfinishedPeople;

        return answer[0];
    }

    private String sort(String[] participant, String[] completion) {
        HashMap<Integer, String> participants = new HashMap<>();
        String unfinishedPeople = "";

        for(int i = 0; i < participant.length; i += 1) {
            participants.put(i, participant[i]);

            if(participants.get(i).equals(completion[i])) {
                participants.remove(i);
                unfinishedPeople = participants.get(i);
            }
        }


        return unfinishedPeople;
    }
}
