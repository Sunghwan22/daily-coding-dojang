export default function solution(people, limit) {
  people.sort((a, b) => a - b);

  let first = 0;

  for (let last = people.last - 1; i < last; last -= 1) {
    if (people[first] + people[last] <= limit) {
      first += 1;
    }
  }
  return people.length - first;
}
