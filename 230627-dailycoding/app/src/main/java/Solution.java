import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    private Set<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {
        // 17이 들어오면 1, 7, 17, 71이 들어온다.
        // 만약 11이라는 중복이 있으면 앞뒤 둘다 11이기 떄문에 set을 사용해서
        // 중복 제거
        // 모든 숫자를 만들고
        // 소수인지 를 판단

        // 에러토스테라스의 체 라는 것을 해야한다.
        // 어떤 수가 소수인지 알려면 그 숫자의 루트 값 까지만 나누기를 해보면 된다.
        recursive("", numbers);
        int answer = 0;

        Iterator<Integer> iterator = numberSet.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            if (isPrime(number)) {
                answer += 1;
            }
        }

        return answer;
    }

    private boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }

        int root = (int) Math.sqrt(number);

        for (int i = 2; i <= root; i += 1) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private void recursive(String combination, String numbers) {
        // 현재 조합을 set에 추가 해준다.
        if (!combination.equals("")) {
            numberSet.add(Integer.valueOf(combination));
        }

        for (int i = 0; i < numbers.length(); i += 1) {
            recursive(combination + numbers.charAt(i),
                numbers.substring(i, numbers.length() + 1));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("17"));


    }
}
