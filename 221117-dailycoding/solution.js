let count = 0;

export function nextNumber(a, b) {
  const nextParicipationNumberForA = Math.floor((a / 2) + Number(a % 2));

  const nextParicipationNumberForB = Math.floor((b / 2) + Number(b % 2));

  count += 1;

  return nextParicipationNumberForA === nextParicipationNumberForB
    ? count
    : nextNumber(nextParicipationNumberForA, nextParicipationNumberForB);
}

export default function solution(number, a, b) {
  if (a > b && a % 2 === 0 && a - b === 1) {
    return 1;
  }

  if (b > a && b % 2 === 0 && b - a === 1) {
    return 1;
  }

  const answer = nextNumber(a, b);

  return answer;
}
