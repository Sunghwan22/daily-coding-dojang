import solution from './reportResult';

test('solution', () => {
  expect(solution(
    ['muzi', 'frodo', 'apeach', 'neo'],
    ['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi'],
    '2',
  )).toStrictEqual([2, 1, 1, 0]);
});

test('report', () => {
  expect(report())
})
