import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());

        int[] a = new int[n];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < n; i += 1) {
            a[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(a);
        int count = 0;

        int startIndex = 0;
        int endIndex = n - 1;

        while(startIndex < endIndex) {
            if(a[startIndex] + a[endIndex] < m) {
                startIndex += 1;
            }

            if(a[startIndex] + a[endIndex] > m) {
                endIndex -= 1;
            }

            if(a[startIndex] + a[endIndex] == m) {
                count += 1;
                startIndex += 1;
                endIndex -= 1;
            }
        }

        System.out.print(count);
    }
}
