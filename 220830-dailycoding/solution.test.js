import { solution } from './solution';


test('sortParticipant', () => {
  solution(['leo', 'kiki', 'eden'], ['leo', 'kiki', 'eden']).toStrictEqual(['leo']);
});
