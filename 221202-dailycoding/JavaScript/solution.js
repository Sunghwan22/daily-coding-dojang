function solution(fees, records) {
  const cars = [...new Set(records.map((record) => record.split(' ')[1]))].sort((a, b) => a - b);
  const getFee = (time) => (time <= fees[0] ? fees[1] : fees[1] + Math.ceil((time - fees[0]) / fees[2]) * fees[3]);
  const getTime = (timeIn, timeOut) => {
    const [timeInHour, timeInMinute] = timeIn.split(':');
    const [timeOutHour, timeOutMinute] = timeOut.split(':');
    return (timeOutHour - timeInHour) * 60 + (timeOutMinute - timeInMinute);
  };

  return cars.map((car) => {
    const timelines = records.filter((record) => record.split(' ')[1] === car).map((record) => record.split(' ')[0]);
    if (timelines.length % 2 === 1) timelines.push('23:59');
    const time = [...Array(timelines.length / 2).keys()]
      .map((i) => getTime(timelines[2 * i], timelines[2 * i + 1]))
      .reduce((acc, curr) => acc + curr, 0);
    return getFee(time);
  });
}
