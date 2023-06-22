import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int coinNumber = scanner.nextInt();
        int targetMoney = scanner.nextInt();

        int[] coins = new int[coinNumber];

        for(int i = 0; i < coinNumber; i += 1) {
            coins[i] = scanner.nextInt();
        }

        int count = 0;

        for(int i = coinNumber - 1; i >= 0; i -= 1 ) {
            if(targetMoney > coins[i]) {
                count += targetMoney / coins[i];
                targetMoney = targetMoney % coins[i];
            }
        }

        System.out.print(count);
        // coinNumber(동전갯수) k(목표금액)
        // A동전 데이터 배열
        // 그리디 알고리즘의 핵심이론 매번 최선의 선택을 하면 최선의 해를 구할 수 가 있다 라는 이론이다.
        // 금액이 큰 동전부터 선택해야 개수를 최소로 구성할 수 있다.

        // 금액이 큰 동전부터 해야하기 때문에 for문을 동전의 금액이 큰 순서 부터 반복을 해준다.
        // if 목표 금액이 현재 동전 보다 작으면 나누어서 플러스를 하고
        // 목표 금액을 다시 업데이트를 해준다.

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    }
}
