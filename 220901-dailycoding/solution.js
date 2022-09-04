/* eslint-disable no-restricted-syntax */
// eslint-disable-next-line import/prefer-default-export
export function solution(n, lost, reserve) {
  const answer = {
    student: n - lost.length,
  };

  lost.sort((a, b) => a - b);
  reserve.sort((a, b) => a - b);

  for (let i = 0; i < lost.length; i += 1) {
    for (let j = 0; j < reserve.length; j += 1) {
      if (lost[i] === reserve[j]) {
        answer.student += 1;
        lost[i] = reserve[j] = -1;
        break;
      }
    }
  }

  for (let i = 0; i < lost.length; i += 1) {
    for (let j = 0; j < reserve.length; j += 1) {
      if (lost[i] - 1 === reserve[j] || lost[i] + 1 === reserve[j]) {
        answer.student += 1;
        reserve[j] = -1;
        break;
      }
    }
  }

  return answer.student;
}
