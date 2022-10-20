// export function lowerCase(s) {
//   return s.toLowerCase().split(' ');
// }

// export function convertUpperCase(lowerCaseStrings) {
//   return lowerCaseStrings.map((v) => v.charAt(0).toUpperCase() + v.slice(1)).join(' ');
// }

// export default function solution(s) {
//   const lowerCaseStrings = lowerCase(s);

//   const answer = convertUpperCase(lowerCaseStrings);

//   return answer;
// }

export default function solution(s) {
  return s.toLowerCase().split(' ')
    .map((v) => v.charAt(0).toUpperCase() + v.slice(1))
    .join(' ');
}
