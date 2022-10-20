export function convertToArray(s) {
  const array = s.split(' ');

  const numberArray = array.map(Number);

  return numberArray;
}

export default function solution(s) {
  const numbers = convertToArray(s);

  const sortArray = numbers.sort((a, b) => a - b);

  const minimum = sortArray[0];
  const maximim = sortArray[sortArray.length - 1];

  const answer = `${minimum} ${maximim}`;

  return answer;
}
