export default function solution(message) {
  const answer = [];

  const dictionary = [];

  for (let i = 65; i <= 90; i += 1) {
    dictionary.push(String.fromCharCode(i));
  }

  let counter = 0;

  while (counter < message.length) {
    let index = 1;

    while (dictionary.indexOf(message.substring(counter, counter + index))
     !== -1 && counter + index <= message.length) {
      index += 1;
    }

    dictionary.push(message.substring(counter, counter + index));

    answer.push(dictionary.indexOf(message.substring(counter, counter + index - 1)) + 1);

    counter += index - 1;
  }

  return answer;
}
