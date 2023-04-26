import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));

        int size = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = new int[size];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < size; i += 1) {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int number = 1;
        boolean result = true;
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < numbers.length; i += 1) {
            int su = numbers[i];

            if(su >= number) {
                while (su >= number) {
                    stack.push(number + 1);
                    stringBuffer.append("+\n");
                }
                stack.pop();
                stringBuffer.append("-\n");
            } else {
                int n = stack.pop();
                if(n < su) {
                    System.out.print("NO");
                    result = false;
                    break;
                } else {
                    stringBuffer.append("-\n");
                }
            }
        }

        if(result) {
            System.out.print(stringBuffer.toString());
        }
    }
}
