import solution from './solution';

test('example', () => {
  expect(solution('3people unFollowed me')).toBe('3people Unfollowed Me');
  expect(solution('for the last week')).toBe('For The Last Week');
});
