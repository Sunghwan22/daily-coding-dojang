// eslint-disable-next-line import/prefer-default-export
export function solution(answers) {
  const answer = [];

  const person1Answer = [1, 2, 3, 4, 5];
  const person2Answer = [2, 1, 2, 3, 2, 4, 2, 5];
  const person3Answer = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  const person1Score = answers.filter((a, i) => a === person1Answer[i % 5]).length;
  const person2Score = answers.filter((a, i) => a === person2Answer[i % 8]).length;
  const person3Score = answers.filter((a, i) => a === person2Answer[i % 10]).length;

  const highScore = Math.max(person1Answer, person2Answer, person3Answer);

  if (highScore === person1Score) {
    answer.push(1);
  }

  if (highScore === person2Score) {
    answer.push(2);
  }

  if (highScore === person3Score) {
    answer.push(3);
  }

  return answer;
}
