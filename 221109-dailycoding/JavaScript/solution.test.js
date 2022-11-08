import { solution } from './solution';

test('solution', () => {
  expect(solution(3, ['tank', 'kick', 'know', 'wheel',
    'land', 'dream', 'mother', 'robot', 'tank'])).toBeStrictEqual([3, 3]);

  expect(solution(5, ['hello', 'observe', 'effect', 'take', 'either', 'recognize',
    'encourage', 'ensure', 'establish', 'hang',
    'gather', 'refer', 'reference', 'estimate', 'executive'])).toBeStrictEqual([0, 0]);

  expect(solution(2, 	['hello', 'one', 'even', 'never',
    'now', 'world', 'draw'])).toBeStrictEqual([1, 3]);
});
