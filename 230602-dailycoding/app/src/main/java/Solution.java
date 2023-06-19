import javax.swing.text.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    private static boolean visited[];
    private static List<Integer>[] A; // 그래프 저장 인접 리스트

    public static void main(String[] args) throws IOException {
        // n = 노드 갯수   // 예시로 6 8
        // m = 에지 개수

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int node = Integer.parseInt(stringTokenizer.nextToken());
        int edge = Integer.parseInt(stringTokenizer.nextToken());

        visited = new boolean[node + 1];
        A = new ArrayList[node + 1];

        for(int i = 1; i < node + 1; i += 1) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < edge; i += 1) {
            // 인접 리스트에 노드 데이터 넣기
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());

            A[start].add(edge);
            A[edge].add(start);
        }

        int count = 0;
        for(int i =1 ; i < node + 1; i +=1) {
            if(!visited[i]) {
                count += 1;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if(visited[v]) {
            return;
        }
        visited[v] = true;

        // 방문 하지 않은 노드가 있다면 다시 재귀
        for(int i : A[v]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
