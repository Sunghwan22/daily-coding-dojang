export function greatestCommonDivisor(a, b) {
  if (b === 0) {
    return b;
  }

  return a % b !== 0 ? greatestCommonDivisor(b, a % b) : b;
}

export default function solution(array) {
  if (array.length === 1) {
    return array[0];
  }

  return array.reduce((a, b) => (a * b) / greatestCommonDivisor(a, b));
}
