import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        // 스택은 후입 선출이다.
        //  큐는 선입 후출
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i += 1) {
            char c = number.charAt(i);

            // 스택이 비어있지 않고 && 스택의 가장 위에 있는 요소가 c보다 작고 k가 0보다 클떄 pop을 해서 요소제ㅔ거
            while (!stack.isEmpty() && stack.peek() < c && k > 0) {
                stack.pop();
                k -= 1;
            }
            stack.push(c);
        }

        for(int i =0; i < result.length; i += 1) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
}