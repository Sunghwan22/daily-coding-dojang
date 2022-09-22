import solution, { greatestCommonDivisor } from './solution';

test('length of array is 1', () => {
  expect(solution([2])).toBe(2);
  expect(solution([5])).toBe(5);
});

test('greatestCommonDivisor', () => {
  expect(greatestCommonDivisor(5, 2)).toBe(1);
  expect(greatestCommonDivisor(2, 5)).toBe(1);
  expect(greatestCommonDivisor(10, 30)).toBe(10);
});

test('length of array is 2', () => {
  expect(solution([2, 5])).toBe(10);
  expect(solution([5, 2])).toBe(10);
  expect(solution([10, 30])).toBe(30);
});

test('solution', () => {
  expect(solution([2, 6, 8, 14])).toBe(168);
});
