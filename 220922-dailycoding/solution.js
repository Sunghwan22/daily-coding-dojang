// 최대공약수 구하고 최소 공배수에 나누면 됨
export function greatestCommonDivisor(a, b) {
  if (b === 0) {
    return a;
  }

  return a % b ? greatestCommonDivisor(b, a % b) : b;
}

export default function nlcm(array) {
  if (array.length === 1) {
    return array[0];
  }

  return array.reduce((a, b) => (a * b) / greatestCommonDivisor(a, b));
}
