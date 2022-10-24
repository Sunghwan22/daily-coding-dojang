import java.util.Stack;

class Solution {
  boolean solution(String s) {
    boolean answer = true;

    Stack<Character> openStack = new Stack<>();

    if (s.charAt(0) == ')') {
      return false;
    }

    for (int i = 0; i < s.length(); i += 1) {
      //여는 괄호를 넣음
      if (s.charAt(i) == '(') {
        openStack.push('(');
      }
      // 스택이 비어있으면 다 짝이 맞다.
      if(s.charAt(i) == ')' && openStack.isEmpty()) {
        return false;
      }

      if (s.charAt(i) == ')' && !openStack.isEmpty()) {
        openStack.pop();
      }
    }
    answer = openStack.isEmpty();

    return answer;
  }
}
