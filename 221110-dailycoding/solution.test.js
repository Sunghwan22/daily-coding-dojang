import solution, { sortArray } from './solution';

test('solution', () => {
  expect(solution([70, 50, 80, 50], 100)).toBe(3);
  expect(solution([70, 80, 50], 100)).toBe(3);
});

test('내림차순으로 정렬하기', () => {
  expect(sortArray([70, 50, 80, 50])).toBeStrictEqual([50, 50, 70, 80]);
});
