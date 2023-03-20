class Solution {
    public int solution(int n, int m, int[] section) {
        int index = 0;
        int answer = 0;

        for(int i =0; i < section.length; i +=1) {
            if(section[i] < index) {
                continue;
            }

            answer += 1;
            index = section[i] + m;
        }

        return answer;
    }

    // 패인트의 시작점은 항상 section[0]이다.
    //  if(section[i] < index) {
    //                continue;
    //            }
    //   여기서는 무조건 처음에는 answer += 1이 된다.
    // 그리고 나서 시작점 + 롤러의 길이를 해서 마지막에 칠해진 곳을 index로 둔다.
    // 그러면 덧칠해야하는 빈벽의 index값보다 작다고 하면은 그냥 패스를 해도 되는 것이다.
    // 왜냐하면 이미 칠해져 있으니까. 안 칠해진 곳이라면 answer에 += 1이 될 거고 방향 같은 경우는 굳이
    // 생각을 안 해도 된다.
}
