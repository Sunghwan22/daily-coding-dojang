import solution, { nextNumber } from './solution';

test('solution', () => {
  expect(solution(8, 4, 7)).toBe(3);
});

test('두 수의 최대공약수 구하기', () => {
  expect(nextNumber(4, 7)).toBe(3);
});
