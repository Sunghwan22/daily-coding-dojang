export default function solution(arr1, arr2) {
  const newArr = [];

  for (let i = 0; i < arr1.length; i += 1) {
    const result = [];
    for (let j = 0; j < arr2[0].length; j += 1) {
      let elem = 0;
      for (let k = 0; k < arr2.length; k += 1) { // arr1[0].length도 가능.
        elem += arr1[i][k] * arr2[k][j];
      }
      result.push(elem);
    }
    newArr.push(result);
  }
  return newArr;
}
