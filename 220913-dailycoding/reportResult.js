export function removeDuplicateItem(array) {
  const set = new Set(array);
  const newArray = [...set];
  return newArray;
}

export function convertToReportedArray(array) {
  const result = array.map((item) => item.split(' '));
  return result;
}

export function makeReportingArray(idList, uniqueArray) {
  const reportingArray = Array(idList.length).fill(0);

  const result = reportingArray.map((_, index) => (
    { user: idList[index], reporting: [] }));

  return result;
}

export function countReportedNumber(id_list, reportedArray) {
  const newReportedArray = [];

  for (let i = 0; i < id_list.length; i += 1) {
    let number = 0;

    for (let j = 0; j < reportedArray.length; j += 1) {
      if (id_list[i] === [reportedArray[j]][1]) {
        number += 1;
      }
    }

    newReportedArray.push([id_list[i], number]);
  }

  return newReportedArray;
}

function solution(id_list, report, k) {
  const answer = [];

  // 1. 리포트 배열에서 중복값 제거
  const uniqueArray = removeDuplicateItem(report);

  // 2-1. 리포터 배열의 각 원소를 split으로 쪼개서 [신고자, 신고당한이] 배열로 만듦
  const reportedArray = convertToReportedArray(uniqueArray);

  // 2-2. id_list와 크기, 원소 순서가 같은 배열을 만들고, 그 배열의 원소가 {신고자, [신고한사람 명단]}
  // 이런 형태를 가질 수 있도록.해보자.

  const reportingArray = makeReportingArray(id_list, uniqueArray);

  countReportedNumber(id_list, reportedArray);

  return answer;
}
