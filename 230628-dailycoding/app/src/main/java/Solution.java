import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothMap = new HashMap<>();

        for (String[] cloth : clothes) {
            String type = cloth[1];
            // 종류의 의상이 몇개가 있냐 라는 것을 알아야 한다.
            // 1. 옷을 종류별로 구분한다.
            // 2. 입지 않는 경우를 추가한다.
            // 아무 종류의 옷도 입지 않을 때가 있어서 -1
            clothMap.put(type, clothMap.getOrDefault(type, 0) + 1);
            // 있으면 + 1 이고 없으면 그냥 1이다 레전드
            // getOrDefaultValue이거 정말 레전드 발상이다 이렇게 생각ㅇ르 할 수 있구나
        }

        int answer = 1;

        for (Integer integer : clothMap.values()) {
            // 입지 않는 경우가 있기 때문에 + 1 을 해줌
            answer *= integer + 1;
        }

        return answer - 1;
    }
}
