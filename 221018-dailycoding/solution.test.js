import solution, { convertToArray } from './Solution';

test('solution', () => {
  expect(solution('-1 -2 -3 -4')).toBe('-4 -1');
});

test('숫자 배열로 변환', () => {
  expect(convertToArray('-1 -2 -3 -4')).toStrictEqual([-1, -2, -3, -4]);
});
