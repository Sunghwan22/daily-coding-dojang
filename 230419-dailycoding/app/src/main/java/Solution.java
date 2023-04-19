import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subjectNumber = scanner.nextInt();
        int[] scores =  new int[subjectNumber];

        for(int i = 0; i < subjectNumber; i +=1) {
            scores[i] = scanner.nextInt();
        }

        long sum = 0;
        long maxScore = 0;

        for(int i = 0; i < subjectNumber; i +=1) {
            if(scores[i] > maxScore) {
                maxScore = scores[i];
            }

            sum += scores[i];
        }

        System.out.print((sum * 100.0) / maxScore / subjectNumber);
    }
}