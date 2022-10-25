import solution, { zeroCount } from './solution';

test('example', () => {
  expect(solution('110010101001')).toStrictEqual([3, 8]);
  expect(solution('01110')).toStrictEqual([3, 3]);
  expect(solution('1111111')).toStrictEqual([4, 1]);
});

test('removeZeroCount', () => {
  expect(zeroCount('110010101001')).toBe(6);
});
