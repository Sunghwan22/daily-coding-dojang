import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer>[] A;
    private static int[] check;
    private static boolean[] visited;
    private static boolean isEven;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i< testCase; i += 1) { // 주어진 테스트 케이스 만큼 반복
            String[] test = bufferedReader.readLine().split(" ");

            int node = Integer.parseInt(test[0]);
            int edge = Integer.parseInt(test[1]);
            A = new ArrayList[node + 1];
            visited = new boolean[node + 1];
            check = new int[node + 1];
            isEven = true;

            for(int j = 0; j <= node; j += 1) {
                A[i] = new ArrayList<Integer>();
            }

            for(int k = 0; k < edge; k += 1) {
                test = bufferedReader.readLine().split(" ");
                // 방향이 없음
                int startNode = Integer.parseInt(test[0]);
                int endNode = Integer.parseInt(test[1]);

                A[startNode].add(endNode);
                A[endNode].add(startNode);
            }

            for(int j = 1; i <= edge; j += 1) {
                if(isEven) {
                    DFS(j);
                }

                if(!isEven) {
                    break;
                }
            }

            if(isEven) {
                System.out.print("YES");
            }

            if(!isEven) {
                System.out.print("NO");
            }
        }
    }

    private static void DFS(int start) {
        visited[start] = true;

        for(int i : A[start]) { // 인접리스트이기 때문에 start에서 연결된 모든 노드를 탐색한다.
            if(!visited[i]) {
                // DFS가기 전에 바로 직전에 있는 노드와 다른 집합으로 분류를 해주는것이 중요
                check[i] = (check[start] + 1) % 2;
                DFS(i);
            }

            if(visited[i]) {
                if(check[start] == check[i]) {
                    isEven = false;
                }
            }
        }
    }
}
