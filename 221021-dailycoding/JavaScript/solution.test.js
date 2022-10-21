import solution from './solution';

test('example', () => {
  expect(solution('()()')).toBe(true);
  expect(solution('(())()')).toBe(true);
  expect(solution(')()(')).toBe(false);
  expect(solution('(()(')).toBe(false);
});
