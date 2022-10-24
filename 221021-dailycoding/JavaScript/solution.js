export default function solution(s) {
  if (s.startsWith(')')) {
    return false;
  }

  const destructuring = [...s];
  const stackArray = [];

  destructuring.map((string) => {
    if (string === '(') {
      stackArray.push('(');
    }

    if (string === ')' && stackArray.length === 0) {
      return false;
    }

    if (string === ')' && stackArray.length !== 0) {
      stackArray.pop();
    }

    return true;
  });

  const answer = stackArray.length === 0;

  return answer;
}
