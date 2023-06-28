import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    private Position left;
    private Position right;
    private Position numPos;

    public String solution(int[] numbers, String hand) {
        // 1. 왼손 오른쪽 위치 초기화
        // 2. 숫자를 누를 손가락 정하기
        // 3. 정해진 손가락을 answer에 저장하고 손가락 이동
        // 3, 0 , 3, 2 는 처음 시작위치이다.
        // 2차원배열에서는 세로 가로 순으로 된다.

        String answer = "";

        left = new Position(3, 0);
        right = new Position(3, 2);
        // 넘버 포지션이면은
        for (int number : numbers) {
            numPos = new Position((number - 1) / 3, (number - 1) % 3);
             if(number == 0) {
                 numPos = new Position(3, 1);
                 String finger = numPos.getFinger(hand);

                 answer += finger;

                 if(finger.equals("L")) {
                     left = numPos;
                 }

                 if(finger.equals("R")) {
                     right = numPos;
                 }
             }
        }

        return answer;
    }

    class Position {
        int row;
        int col;

        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public String getFinger(String hand) {
            // 손가락을 움직이는 법칙을 이 함수에서 하겠다.
            String finger = hand.equals("right") ? "R" : "L";

            if(this.col == 0) {
                finger = "L";
            }

            if(this.col == 2) {
                finger = "R";
            }

            if(this.col == 1) {
                int leftDistance = left.getDistance(this);
                int rightDistance = right.getDistance(this);

                if(leftDistance < rightDistance) {
                    finger = "L";
                }

                if(leftDistance > rightDistance) {
                    finger = "R";
                }
            }

            return finger;
        }

        private int getDistance(Position position) {
            return Math.abs(this.col - position.col) + Math.abs(this.row - position.row);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution.solution(numbers, hand));
    }
}


