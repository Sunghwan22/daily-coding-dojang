import solution, { greatestCommonDivisor } from './solution';

test('solution', () => {
  expect(solution([2, 6, 8, 14])).toBe(168);
  expect(solution([1, 2, 3])).toBe(6);
  expect(solution([1])).toBe(1);
});

test('두 수의 최대공약수 구하기', () => {
  expect(greatestCommonDivisor(2, 6)).toBeStrictEqual(2);
});
