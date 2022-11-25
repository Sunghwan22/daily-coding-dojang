export default function solution(citations) {
  let answer = 0;
  const sort = citations.sort((a, b) => b - a);
  sort.forEach((el, i) => {
    if (i + 1 <= el) {
      answer = i + 1;
    }
  });
  return answer;
}
