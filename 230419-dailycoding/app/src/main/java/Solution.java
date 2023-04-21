import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        // scanner와 같이 사용자의 입력을 받아오는 클래스이다. 성능차이가 많이 나니 코테에서는
        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        // 문자열을 입력을 받아오는 순서대로 나누는 클래스이다. 토큰라이저에 파라미터로 어떻게 나눌 것인 가를 할 수 있다.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // suno = 숫자객수 quizNo(질의 갯수)
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        // 숫자형 데이터는 long이 더 좋다.
        long[] sum = new long[suNo + 1];

        for(int i = 1; i <= suNo; i +=1) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            sum[i] = sum[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int j = 0; j < quizNo; j += 1) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());

            System.out.print(sum[k] - sum[i - 1]);
        }
    }
}
