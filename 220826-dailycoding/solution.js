// eslint-disable-next-line import/prefer-default-export
export function convertString(s) {
  const replaceSentence = s.replace(/zero/g, '0')
  .replace(/one/g, '1')
  .replace(/two/g, '2')
  .replace(/three/g, '3')
  .replace(/four/g, '4')
  .replace(/five/g, '5')
  .replace(/six/g, '6')
  .replace(/seven/g, '7')
  .replace(/eight/g, '8')
  .replace(/nine/g, '9');

return Number(replaceSentence);
}


export function solution(s) {
  const answer = 0;

  convertString(s);

  return answer;
}
