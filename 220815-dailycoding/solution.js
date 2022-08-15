function solution(n) {
    var answer = [];

    let number = n + "";

    for(let i = number.length -1; i>= 0; i -= 1) {
        answer.push(Number(number[i]));
    }

    return answer;
}
