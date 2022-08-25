import { solution } from './solution';

test('sampleTest', () => {
  expect(solution([1, 2, 3, 4, 5])).toStrictEqual([1]);
});

test('sameScoreTest', () => {
  expect(solution([1, 3, 2, 4, 2])).toStrictEqual([1, 2, 3]);
});
