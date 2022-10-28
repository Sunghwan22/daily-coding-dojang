export function searchNumber(number, oneCount) {
  const nextNumber = number + 1;

  const nextNumberOneCount = nextNumber.toString(2).match(/1/g).length;
  console.log(`match,  ${nextNumber.toString(2).match(/1/)}`);
  // console.log(`global, ${nextNumber.toString(2).match(/1/g)}`);
  return nextNumberOneCount === oneCount ? nextNumber : searchNumber(number + 1, oneCount);
}
export default function solution(number) {
  const oneCount = number.toString(2).match(/1/g).length;

  return searchNumber(number, oneCount);
}
