import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 그리디 알고리즘은 항상 최선의 선택을 보장하지는 않는다.
        // 음 인풋이 제곱 즉 배수형태로 나오면은 반례가 없다.
        // 그리디 알고리즘으로 풀 수 있도록 뒤의 동전 가격 부터 사용을 하면은 된다.

        Scanner scanner = new Scanner(System.in);

        int coin = scanner.nextInt();
        int targetMoney = scanner.nextInt();

        int[] coins = new int[coin];

        for(int i = 0; i < coin; i += 1) {
            coins[i] = scanner.nextInt();
        }

        int count = 0;

        for(int i = coin - 1; i >= 0; i -= 1 ) {
            // 타겟 머니 보다 작거나 같으면은 카운트에 몇개를 사용했는지 더해주고
            // 타겟머니는 이제 그 나머지 값이 되면 된다.
            if(coins[i] <= targetMoney) {
                count += (targetMoney / coins[i]);
                targetMoney = targetMoney % coins[i];
            }
        }

        System.out.println(count);
    }
}
