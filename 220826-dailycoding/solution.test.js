import { convertString } from './solution';

test('convertZero', () => {
  expect(convertString('zero')).toStrictEqual(0);
});

test('convertStringWithNumber', () => {
  expect(convertString('one4seveneight')).toStrictEqual(1478);
});

test('solution', () => {
  expect(convertString('one4seveneight')).toBe(1478);
  expect(convertString('23four5six7')).toBe(234567);
  expect(convertString('14')).toBe(14);
});
