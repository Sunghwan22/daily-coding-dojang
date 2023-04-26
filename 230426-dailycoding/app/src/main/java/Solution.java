import com.google.common.collect.ForwardingQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
    // 가장 위에 있는 카드를 바닥에 버린다.
    // 가장 위에 있는 카드를 가장 아래에 있는 카드 밑으로 옮긴다.
    // 1
    // 2     3
    // 3     4      2
    // 4     2      4       4
    // n이 4일경우 이렇게 가장 마지막에 있는 카드는 4이다.

    // 지금 상황이 데이터의 양쪽에서 삽입과 삭제가 일어나기 때문에 queue를 사용한게 좋을 것 같다.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i += 1) {
            queue.add(i);
        }

        while (queue.size() == 1) {
            int temp = queue.poll();

            queue.add(temp);
        }

        System.out.print(queue.poll());
    }
}
