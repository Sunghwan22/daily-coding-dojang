import solution from './solution';

test('solution', () => {
  expect(solution(4)).toBe(5);
  expect(solution(3)).toBe(3);
});

test('nEqualOne', () => {
  expect(solution(1)).toBe(1);
});
