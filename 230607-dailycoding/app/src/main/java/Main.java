import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] numberArray = new int[number];

        for(int i =0; i < number; i += 1) {
            numberArray[i] = scanner.nextInt();
        }

        Arrays.sort(numberArray);

        int searchNumber =scanner.nextInt();
        for(int i =0; i < searchNumber; i += 1) {
            boolean find = false;
            int target = scanner.nextInt();
            int start = 0;
            int end = numberArray.length - 1;

            // start가 end보다 같거나 작을 때
            while(start <= end) {
                int midIndex = (start + end) / 2;
                int midValue = numberArray[midIndex];

                if(midValue > target) {
                    // 중앙값이 타겟보다 클 떄는 오른쪽 데이터 셋
                    end = midIndex -1;
                }

                if(midValue < target) {
                    // 중앙값이 타겟보다 작을 때는 왼쪽 데이터 셋
                    start = midIndex + 1;
                }

                if(target == midValue) {
                    find = true;
                    break;
                }
            }

            if(find) {
                System.out.println(1);
            }

            if(!find) {
                System.out.println(0);
            }
        }
    }
}
