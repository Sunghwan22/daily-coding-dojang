// eslint-disable-next-line import/prefer-default-export
export function sortArray(participant, completion) {
  participant.sort();
  completion.sort();

  for (let i = 0; i < completion.length; i += 1) {
    if (participant[i] !== completion[i]) {
      return participant[i];
    }
  }
  return participant[participant.length - 1];
}

export function solution(participant, completion) {
  return sortArray(participant, completion);
}
