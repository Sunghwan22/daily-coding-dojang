import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    final static int Max = 25 + 10;
    static boolean[][] graph;
    static boolean[][] visited;
    static int countPerDanJi;
    static int dirY[] = {1, -1, 0, 0};
    static int dirX[] = {0, 0, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        graph = new boolean[Max][Max];
        visited = new boolean[Max][Max];

        for(int i =0; i <= N; i += 1) {
            String s = bufferedReader.readLine();

            for(int j = 1; j <= N; j += 1) {
                graph[i][j] = s.charAt(j - 1) == '1';
            }
        }

        List<Integer> countList = new ArrayList<>();

        for(int i = 1; i <= N; i += 1) {
            for(int j =0; j <= N; j += 1) {
                if(graph[i][j] && !visited[i][j]) {
                    countPerDanJi = 0;
                    dfs(i, j);
                    countList.add(countPerDanJi);
                }
            }
        }
    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        countPerDanJi += 1;

        // 상하좌우 체크
        for(int i =0; i < 4; i += 1) {
            int newY = y + dirY[i];
            int newX = y + dirX[i];

            if(!visited[newY][newX] && graph[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }
}
