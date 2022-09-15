import solution from './solution';

test('solution', () => {
  expect(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19]).toStrictEqual([3, 5]));
  expect(solution([0, 0, 0, 0, 0, 0], [38, 19, 20, 40, 15, 25]).toStrictEqual([1, 6]));
  expect(solution([45, 4, 35, 20, 3, 9], [20, 9, 3, 45, 4, 35]).toStrictEqual([1, 1]));
});
