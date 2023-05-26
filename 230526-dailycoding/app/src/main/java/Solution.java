import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    private static boolean[] visited;
    private static ArrayList<Integer>[] a;
    // 노드 개수 N
    // 에지 개수 M
    // 그래프 데이터 저장 인접 리스트 A
    // visited 방문 기록 저장
    // for(n 만큼 반복) {
    // A 인접 리스트의 각 arrayList 초기화하기

    // for(m의 개수만큼 반복하기) {
    // A 인접 리스트에 그래프 데이터 저장하기

    // for(n의 갯수만큼 반복하기) {
    //if(방문하지 않은 노드가 있다면) {
    // 연결 요소 개수 += 1
    // }   // 잠시만 다시 보자

    //  재귀의 형태로 DFS를 실행한다.
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 첫번째 줄 받음
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        // visited 배열을 만들자
        visited = new boolean[n + 1];

        a = new ArrayList[n + 1];

        // 인접 노드 들 넣기위해 그래프 초기화
        for (int i = 1; i < n + 1; i += 1) {
            a[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i += 1) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());

            a[s].add(s);
            a[e].add(e);
        }

        int count = 0;

        for(int i =0; i < n; i += 1) {
            // 방문하지 않은 노드
            if(!visited[i]) {
                count += 1;
                DFS(i);
            }
        }
    }

    private static void DFS(int v) {
        if(visited[v]) {
            return;
        }

        // 방문한 노드가 된다.
        visited[v] = true;
        for(int i : a[v]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
