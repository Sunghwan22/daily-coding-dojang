/* eslint-disable max-len */

// words.slice(0, index) 를 하면 새로운 배열을 생성하는데 0, index까지를 가지고 있는배열
// reduce의 누적값에 마지막 단어를 누적시키고 currentWord의 첫번째 값을 비교하면 되지 않을까?
// indexOf는 특정 문자열을 찾아서 있으면 찾는 단어가 시작하는 인덱스 값을 반환하고 아니면 -1 반환
// 끝말잇기니까 0이 반환이 되야 한다.

export default function solution(number, words) {
  let answer = 0;

  words.reduce((previousWord, currentWord, index) => {
    answer = answer || ((words.slice(0, index).indexOf(currentWord) !== -1 || previousWord !== currentWord[0]) ? index : 0);

    return currentWord[currentWord.length - 1];
  }, '');

  return answer ? [(answer % number) + 1, Math.floor(answer / number) + 1] : [0, 0];
}
