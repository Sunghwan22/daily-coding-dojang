function solution(number) {
  const initialCase = Array(3).fill(0).map((_, index) => index);

  const allCases = Array(number + 1).fill(0).reduce((cases, _, index) => {
    if (index <= 2) {
      return cases;
    }

    const casesAdded = [...cases, (cases[index - 1] + cases[index - 2]) % 1234567];
    return casesAdded;
  }, initialCase);

  return allCases(number);
}
