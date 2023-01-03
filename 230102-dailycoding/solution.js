export default function solution(storey) {
  if (storey < 5) {
    return storey;
  }

  const rest = storey % 10;
  const value = (storey - rest) / 10;

  return Math.min(rest + solution(value), 10 - rest + solution(value + 1));
}
