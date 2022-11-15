import solution, { greatestCommonDivisor } from './solution';

test('solution', () => {
  expect(solution([2, 6, 8, 14], 100)).toBe(168);
  expect(solution([1, 2, 3], 100)).toBe(6);
});

test('두 수의 최대공약수 구하기', () => {
  expect(greatestCommonDivisor(2, 6)).toBeStrictEqual(2);
});
