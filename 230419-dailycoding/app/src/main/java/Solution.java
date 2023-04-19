import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String sNum = scanner.nextLine();

        char[] charArray = sNum.toCharArray();

        int sum = 0;

        for(int i = 0; i< charArray.length; i += 1) {
            sum += charArray[i] - '0';
        }

        System.out.print(sum);
    }

    public int solution(int n, String sNum) {
        char[] charArray = sNum.toCharArray();

        int sum = 0;

        for(int i =0; i < charArray.length; i +=1) {
            sum += charArray[i] - '0';  // 아스키 코드 이키 떄문에 인트로 바꿔주지 않으면 값이 다르게 나온다.
        }

        return sum;
    }
}