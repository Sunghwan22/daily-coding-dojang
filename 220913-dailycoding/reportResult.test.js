import {
  removeDuplicateItem, convertToReportedArray, makeReportingArray,
} from './reportResult';

test('Remove Duplicate Items in Report Array', () => {
  expect(removeDuplicateItem([])).toStrictEqual([]);
  expect(removeDuplicateItem([
    'muzi frodo',
    'apeach frodo',
    'frodo neo',
    'muzi neo',
    'apeach muzi',
  ])).toStrictEqual([
    'muzi frodo',
    'apeach frodo',
    'frodo neo',
    'muzi neo',
    'apeach muzi',
  ]);
  expect(removeDuplicateItem(['ryan con', 'ryan con', 'ryan con', 'ryan con']))
    .toStrictEqual(['ryan con']);
});

test('convertedToReportedArray', () => {
  expect(convertToReportedArray([
    'muzi frodo',
    'apeach frodo',
  ])).toStrictEqual([['muzi', 'frodo'], ['apeach', 'frodo']]);
});

test('makeReportingArray', () => {
  expect(makeReportingArray(['1', '2', '3'], ['1', '2', '3']))
    .toStrictEqual([
      { user: '1', reporting: [] },
      { user: '2', reporting: [] },
      { user: '3', reporting: [] },
    ]);
});
