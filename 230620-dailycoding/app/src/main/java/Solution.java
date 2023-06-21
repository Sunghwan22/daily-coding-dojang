class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        // 1이 나오면 모드가 바뀝다.
        // code[index] 1이 아니면 index가 짝수 일때 ret의 맨 뒤에 code[index]를 추가한다.
        // code[index] 1이 아니면 index가 홀수 일때 ret의 맨 뒤에 code[index]를 추가한다.

        for(int i = 0; i < code.length(); i += 1) {
            if(mode == 0 && code.charAt(i) == '1') {
                mode = 1;
                continue;
            }

            if(mode == 1 && code.charAt(i) == '1') {
                mode = 0;
                continue;
            }

            // 모드만 바꾸고 반복문을 한번 종료를 해야한다 컨티뉴를 안해서 그럼
            if(i % 2 == 0 && mode == 0 && code.charAt(i) != '1') {
                answer.append(code.charAt(i));
            }

            if(i % 2 == 1 && mode == 1 && code.charAt(i) != '1') {
                answer.append(code.charAt(i));
            }
        }

        if(answer.length() == 0) {
            return "EMPTY";
        }

        return answer.toString();
    }
}
