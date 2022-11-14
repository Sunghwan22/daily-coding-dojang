import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        if (array.length == 1) {
            return array[0];
        }

        int bigDivisor = greatestCommonDivisor(array[0], array[1]);

        answer = array[0] * array[1] / bigDivisor;

        if (array.length > 2) {
            for (int i = 2; i < array.length; i += 1) {
                bigDivisor = greatestCommonDivisor(answer, array[i]);
                answer = answer * array[i] / bigDivisor;
            }
        }

        return answer;
    }

    //최대 공약수 구하는 공식
    public int greatestCommonDivisor(int firstNumber, int secondNumber) {
        int rest = firstNumber % secondNumber;

        if (rest == 0) {
            return secondNumber;
        }

        if (rest != 0) {
            return greatestCommonDivisor(secondNumber, rest);
        }

        return 0;
    }
}
