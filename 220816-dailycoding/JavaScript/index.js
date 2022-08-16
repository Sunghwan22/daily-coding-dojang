function solution(n)
{
    var answer = 0;

    const number = String(n);

    for(let i = 0; i<number.length; i+=1) {
        answer += Number(number.charAt(i))
    }

    return answer;
}