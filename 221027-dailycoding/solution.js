// 그러면 일단은 number숫자만큼 가지고 있는 배열을 만들어야 겠고
// 그리고 배열을 돌면서 1 ~ 15, 2 ~ 15, 3 ~ 15, 4 ~ 15 이런 식으로 돌아야 하는데
export function numberToArray(number) {
  return Array(number).fill().map((value, index) => index + 1);
}

export function oddNumber(numbers) {
  return numbers.filter((number) => number % 2);
}

export function filter(oddNumbers, initialNumber) {
  return oddNumbers.filter((number) => !(initialNumber % (number))).length;
}

export default function solution(n) {
  const numbers = numberToArray(n);

  const oddNumbers = oddNumber(numbers);

  return filter(oddNumbers, n);
}
