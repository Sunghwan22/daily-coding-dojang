// 제이든 케이스란 모든 첫글자가 대문자이고 나머지는 소문자
// 그리고 숫자가 아니면 똑같고 나머지 글자는 소문자 ex 3people unFollowed Me

// 3people unFollowed Me 가 들어오면 unFollowed 에서  F를 소문자로 바꾸고 U를 대문자로
// 뛰어쓰기가 연속해서 나올 수도 있다.
// 숫자는 단어의 첫 문자로만 나온다.

class Solution {
  public String solution(String s) {
    String answer = "";

    // 일단은 전부 소문자로 만들기
    String[] lowerCaseArray = toLowerCase(s);

    // 공백체크
    boolean blank = true;

    for (int i = 0; i < lowerCaseArray.length; i += 1) {
      // 앞에 공백이 왔다는 건 다음 글자는 대문자가 되야함
      answer += blank ? lowerCaseArray[i].toUpperCase() : lowerCaseArray[i];
      // 공백이면 blank는 트루
      blank = lowerCaseArray[i].equals(" ");
    }

//    for(String charter : lowerCaseArray) {
//      answer += blank ? charter.toUpperCase()  : charter;
//      blank = charter.equals(" ");
//    }

    return answer;
  }

  public String[] toLowerCase(String s) {
    String[] array = s.toLowerCase().split("");

    return array;
  }
}