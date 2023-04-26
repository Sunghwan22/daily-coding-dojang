import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Solution {
   // 아하 0이 나오면은 출력을 한다.
    // 가장 작은수를 출력한다. ( 절대값이 같은 경우 더 작은 값을 출력한다.
    // 배열이 비어 있으면 0을 출력을 한다.

    // 데이터가 새로 삽입될 떄마다 절대값과 관련된 정렬이 필요하다.
    // 그 다음 우선순위 큐를 통해서 쉽게 해결을 할 수 있겠다.
    // 절대값이 작은 순서대로 정렬을 하고 그대로 출력을 하면은 된다.
    public static void main(String[] args) throws IOException {
        // 우선순위 정렬을 커스터마이징 하는 방법을 공부해보자
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            // 절대값이 작은 데이터 우선
            // 절대값이 같은 경우 음수를 우선해서 정렬한다.
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);

            if(firstAbs == secondAbs) {
                return o1 > o2 ? 1 : -1;
            }

            return firstAbs - secondAbs;
        });

        for(int i = 0; i < n; i +=1) {
            int request = Integer.parseInt(bufferedReader.readLine());
            if(request == 0) {
                if(priorityQueue.size() == 0) {
                    System.out.println("0");
                }

                if(priorityQueue.size() != 0) {
                    System.out.println(priorityQueue.poll());
                }
            }

            if(request != 0) {
                priorityQueue.add(request);
            }
        }
    }
}
