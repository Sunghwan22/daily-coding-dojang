import { solution } from './solution';

test('solution', () => {
  expect(solution(5, [2, 4], [1, 3, 5])).toBe(5);
  expect(solution(5, [2, 4], [3])).toBe(4);
  expect(solution(3, [3], [1])).toBe(2);
});

test('lostAndReserve', () => {
  expect(solution(10, [1, 2, 5, 6, 9], [1, 3, 5, 6])).toBe(9);
  expect(solution(3, [1, 2], [2, 3])).toBe(2);
});