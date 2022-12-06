function solution(s) {
  const pair = { ']': '[', '}': '{', ')': '(' };
  const len = s.length;
  const stack = [];

  let count = 0;
  for (let i = 0; i < len; i += 1) {
    for (let j = i; j < len + i; j += 1) {
      stack.push(s[j % len]);
      if (stack.length >= 2 && pair[stack[stack.length - 1]] === stack[stack.length - 2]) {
        stack.length -= 2;
      }
    }
    if (stack.length === 0) count++;
    stack.length = 0;
  }

  return count;
}
