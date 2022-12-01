export default function solution(string) {
  return JSON.parse(string.replace(/{/g, '[').replace(/}/g, ']'))
    .sort((a, b) => a.length - b.length)
    .reduce((array, value, number) => {
      if (number) {
        return array.concat(value.filter((v) => !array.includes(v)));
      }
      return value;
    }, []);
}
