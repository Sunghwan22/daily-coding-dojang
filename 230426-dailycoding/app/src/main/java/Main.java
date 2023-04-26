import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for(int i =0; i < n; i += 1) {
            numbers[i] = scanner.nextInt();
        }

        for(int i =0; i < n -1; i += 1) {
            for(int j=0; j < n - 1 - i; i += 1) {
                if(numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];

                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < numbers.length; i += 1) {
            System.out.println(numbers[i]);
        }
    }
}
