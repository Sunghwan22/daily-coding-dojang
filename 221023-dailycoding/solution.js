export function zeroCount(string) {
  const count = string.split('').filter((i) => i === '0').join('').length;

  return count;
}

export function toBinary(string) {
  const removeZeroString = string.replace(/0/g, '');

  return removeZeroString.length.toString(2);
}

export default function solution(string) {
  const answer = [0, 0];

  while (string !== '1') {
    answer[1] += zeroCount(string);
    answer[0] += 1;
    string = toBinary(string);
  }

  return answer;
}
