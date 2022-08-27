// s를 매개변수로 받아서 영단어를 숫자로 바꾸기

// 할 일: 일단 문자열을 숫자로 바꿔야 한다. Integer.parseint?를 사용하면 될 것 같고
//      s에 숫자만 들어오면? 그대로 리턴을 해야함

// 일단 s를 인풋으로 받는 메소드를 만들자 이름은 convertToNumber?? 정도로 하면 될까? 오케이 일단 진행
// 맨 처음 케이스 s에 "zero"가 들어왔다고 생각해보자 zero를 0으로 바꿔야 한다... 문자열을 바꾼다..
// replace 메소드를 사용하면 될 것 같음. V
//  zeronineeight이런 식으로 있으면 어떻게 해야하지? replace를 한 번에 다 할 수 는 없음..
//  영단어들을 뭔가 저장을 하고 꺼내 쓸 수 있을까? 고정 된 값이니까 배열로 영단어 목록을 만들자
//  배열로 만들고 for문을 사용해서 replace(numbers[i] -> 각 요소를 돌면서 해당하는게 있으면 바꿔줄 수 있을 거 같은데
//  그러면 숫자로 어떻게 바꿔 줘야하지?... 일단 여기까지 만들어 보자

//  1. convertToNumber 라는 메소드를 만든다 s를 받아와야함
//  2. replace메소드를 사용해서 변환을 시켜보자
//  3. replace를 그러면 10번 써줘야 할 것 같은데?
//  4. 반복이 있을 것 같음 switch 나 for문을 쓸 수 있으면 써보자.


class Solution {
  public int solution(String s) {
    String convertString = changeString(s);

    int answer = Integer.parseInt(convertString);

    return answer;
  }

  public String changeString(String s) {
    String[] number = {"zero", "one", "two", "three", "four"
        , "five", "six", "seven", "eight", "nine"};

    for (int i = 0; i < number.length; i += 1) {
        s = s.replace(number[i], Integer.toString(i));
    }

    return s;
  }
}
