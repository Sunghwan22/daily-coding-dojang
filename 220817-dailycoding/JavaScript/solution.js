// eslint-disable-next-line import/prefer-default-export
export function descending(n) {
  const number = String(n);

  const descendingArray = [];

  for (let i = 0; i < number.length; i += 1) {
    descendingArray[i] = Number(number.charAt(i));
  }

  descendingArray.sort((a, b) => b - a);

  return descendingArray;
}

export function solution(n) {
  let answer = 0;
  let array = [];

  array = descending(n);

  for (let i = 0; i < array.length; i += 1) {
    answer += String(array[i]);
  }

  return Number(answer);
}
