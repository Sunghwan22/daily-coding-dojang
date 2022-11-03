import java.util.Stack;

class Solution {
  public int solution(String string) {
    Stack<Character> stack = new Stack<>();

    for (char word : string.toCharArray()) {
      if(stack.isEmpty() || stack.peek() != word) {
        stack.add(word);
      }
      else {
        stack.pop();
      }
    }

    int answer = 0;

    if (stack.isEmpty()) {
      answer = 1;
    }
    return answer;
  }
}


