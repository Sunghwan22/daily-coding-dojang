import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static int answer = 0;

    public static void main(String[] args) {
        // 빼기가 나올 떄 마다 괄호를 치고
        // 그렇게 여러개가 나오면 제일 큰 친구를 찾아서
        Scanner scanner = new Scanner(System.in);

        String example = scanner.nextLine();

        String[] str = example.split("-");

        for(int i =0; i < str.length; i += 1) {
            int sum = mySum(str[i]);

            // 맨 처음에 100이 있으니까 그건 더해 줘야함
            if(i == 0) {
                answer = answer + sum;
            }

            if(i != 0) {
                answer = answer - sum;
            }
        }

        System.out.print(answer);
    }

    private static int mySum(String example) {
        int sum = 0;

        String[] str = example.split("[+]");

        for(int i =0; i < str.length; i += 1) {
            sum = sum + Integer.parseInt(str[i]);
        }

        return sum;
    }
}
