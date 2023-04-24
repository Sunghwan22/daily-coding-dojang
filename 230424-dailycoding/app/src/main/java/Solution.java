import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    private static int[] myArray;
    private static char[] charArray;
    private static int[] checkArray;
    private static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int s = Integer.parseInt(stringTokenizer.nextToken());
        int p = Integer.parseInt(stringTokenizer.nextToken());
        int result = 0;
        checkArray = new int[4];
        myArray = new int[4];
        char[] a = new char[s];

        checkSecret = 0;

        a = bufferedReader.readLine().toCharArray();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < 4; i += 1) {
            checkArray[i] = Integer.parseInt(stringTokenizer.nextToken());

            if (checkArray[i] == 0) {
                checkSecret += 1;
            }
        }

        for (int i = 0; i < p; i += 1) {
            add(a[i]);
        }

        if(checkSecret == 4) {
            result += 1;
        }

        for(int i = p; i < s; i += 1) {
            int j = i - p;
            add(a[i]);
            remove(a[j]);

            if(checkSecret == 4) {
                result += 1;
            }
        }

        System.out.print(result);
        bufferedReader.close();
    }

    private static void remove(char character) {
        switch (character) {
            case 'A' :
                myArray[0] -= 1;
                if(myArray[0] == checkArray[0]) {
                    checkSecret -= 1;
                    break;
                }
            case 'C' :
                myArray[1] -= 1;
                if(myArray[1] == checkArray[1]) {
                    checkSecret -= 1;
                    break;
                }
            case 'G' :
                myArray[2] -= 1;
                if(myArray[2] == checkArray[2]) {
                    checkSecret -= 1;
                    break;
                }
            case 'T' :
                myArray[3] -= 1;
                if(myArray[3] == checkArray[3]) {
                    checkSecret -= 1;
                    break;
                }
        }
    }

    public static void add(char character) {
        switch (character) {
            case 'A' :
                myArray[0] += 1;
                if(myArray[0] == checkArray[0]) {
                    checkSecret += 1;
                    break;
                }
            case 'C' :
                myArray[1] += 1;
                if(myArray[1] == checkArray[1]) {
                    checkSecret += 1;
                    break;
                }
            case 'G' :
                myArray[2] += 1;
                if(myArray[2] == checkArray[2]) {
                    checkSecret += 1;
                    break;
                }
            case 'T' :
                myArray[3] += 1;
                if(myArray[3] == checkArray[3]) {
                    checkSecret += 1;
                    break;
                }
        }
    }
}
