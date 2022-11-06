export default function solution(s) {
  const stack = [];

  s.split('').forEach((alphabet) => {
    if (stack.length !== 0 && stack[stack.length - 1] === alphabet) {
      stack.pop();
    } else {
      stack.push(alphabet);
    }
  });

  return stack.length === 0 ? 1 : 0;
}
