class Solution {
    public int solution(int number, int a, int b) {
        int people = number;

        int answer = 0;

        if (a > b && a % 2 == 0 && a - b == 1) {
            return 1;
        }

        if (b > a && b % 2 == 0 && b - a == 1) {
            return 1;
        }

        while (true) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;

            answer += 1;

            if (a == b) {
                break;
            }
        }
        return answer;
    }
}