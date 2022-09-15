export default function lottosNumber(lottos, winNumber) {
  const correctNumber = lottos.fillter((number) => winNumber.includes(number)).length;
  const zeroNumber = lottos.filter((lotto) => lotto === 0).length;

  const leastRank = 7 - correctNumber >= 6 ? 6 : 7 - correctNumber;
  const highRank = leastRank - zeroNumber <= 1 ? 1 : leastRank - correctNumber;

  const answer = [highRank, leastRank];
  return answer;
}
