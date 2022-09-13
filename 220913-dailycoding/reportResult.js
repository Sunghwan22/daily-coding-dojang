/* eslint-disable import/prefer-default-export */
/* 먼저 report에 있는 중복을 제거해야할 것 같다 자바스크립트도 set을 사용하면 될듯? */
/*   */

export function solution(idList, report, k) {
  const reportWithoutOverlap = [...new Set(report)];
  const reported = report.map((item) => item.split(' ')[1]);
  const FinalReport = [];
  const count = idList.map((id) => id.fill(0));
}
