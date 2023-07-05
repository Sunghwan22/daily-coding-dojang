import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String str = bufferedReader.readLine().toUpperCase();

        int[] count = new int[26];

        int maxValue = 0;
        char maxCharter = '?';

        for(int i =0; i < str.length(); i += 1) {
           int index =  str.charAt(i) - 'A';
            // 문자의 인덱스를 계산하고 싶다면 - A를 하면 된다.
            count[index] += 1;

            if(maxValue < count[index]) {
                maxValue = count[index];
                maxCharter = str.charAt(i);
            }

            if(maxValue == count[index]) {
                maxCharter = '?';
            }
        }
    }
}
