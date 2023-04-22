import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int materialNumber = Integer.parseInt(bufferedReader.readLine());
        int armorNumber = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] materials = new int[materialNumber];

        for(int i =0; i < materialNumber; i += 1) {
            materials[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(materials);
        int count = 0;
        int startIndex = 0;
        int endIndex = materialNumber - 1;

        while(startIndex < endIndex) {
            if(materials[startIndex] + materials[endIndex] < armorNumber) {
                startIndex += 1;
            }

            if(materials[startIndex] + materials[endIndex] > armorNumber) {
                endIndex -= 1;
            }

            if(materials[startIndex] + materials[endIndex] == armorNumber) {
                count += 1;
                startIndex += 1;
                endIndex -= 1;
            }
        }

        System.out.print(count);
    }
}
