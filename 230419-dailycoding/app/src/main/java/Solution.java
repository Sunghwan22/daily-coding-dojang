import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 1;
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;

        // endIndex가 1작을 때 까지 하면은 될 것 같기도 하고
        while(endIndex != n) {
            // 합이 자연수 보다 N 보다 작다면은 endIndex를 늘림
            if(sum < n) {
                endIndex++;
                sum += endIndex;
            }
            // 합이 자연수 보다 크다면 숫자를 줄여야 하기 떄문에 startIndex += 1
            else {
                sum -= startIndex;
                startIndex++;
            }

            if(sum == n) {
                count++;
                endIndex++;
                sum += endIndex;
            }
        }

        System.out.print(count);
    }
}
