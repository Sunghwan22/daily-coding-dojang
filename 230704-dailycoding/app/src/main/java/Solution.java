import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i =0; i < t; i += 1) {
            int n = Integer.parseInt(bufferedReader.readLine());

            for(int j =0; j < n; j += 1) {
                StringTokenizer stringTokenizer = new StringTokenizer(
                    bufferedReader.readLine());
                stringTokenizer.nextToken(); // 옷의 이름은 필요하지 않음

                String type = stringTokenizer.nextToken();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }
        }
    }
}
