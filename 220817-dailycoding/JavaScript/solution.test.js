/* eslint-disable no-undef */
import { solution, descending } from './solution';

test('answer', () => {
  expect(solution(118372)).toStrictEqual(873211);
});

test('descending', () => {
  expect(descending(118372)).toStrictEqual([8, 7, 3, 2, 1, 1]);
});
