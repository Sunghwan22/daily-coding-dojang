import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));

        BufferedWriter bufferedWriter = new BufferedWriter(
            new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(
            bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i += 1) {
            map.put(bufferedReader.readLine(), 1);
        }

        List<String> answer = new ArrayList<>();

        for(int i =0; i < N; i += 1) {
            String name = bufferedReader.readLine();
            if(map.containsKey(name)) {
                answer.add(name);
            }
        }

        Collections.sort(answer);
    }
}
