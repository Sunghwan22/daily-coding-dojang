class SecretMap {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n];

    for(int i =0; i<n; i+=1) {
      answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
    }

    //문자열 제일 처음에 공백이 들어오면 처리를 못하고 있음
    // 모든 배열의 i번째의 length는 무조건 n이여야함 그러면 지금 처럼 n보다 작으면 공백을 추가해줘야 하는데
    // string.format % n s 를 하면 answer[i]가
    // 아하 일단은 공백을 n만큼 만들고 뒤에서 부터 answer[i]의 내용으로 채워나가는 구나 default가 오른쪽 정렬이여서

    for(int i = 0; i < n; i+=1) {
      answer[i] = String.format("%" + n + "s", answer[i]);
      answer[i] = answer[i].replace("1", "#");
      answer[i] = answer[i].replace("0", " ");
    }

    return answer;
  }

  public static void main(String[] args) {
    String temp = "qweqwe";

    System.out.println(String.format("%" + 8 + "s" , temp));
  }
}