package dailycoding;

public class HashadNumber2 {
  public boolean solution(int x) {

    int sum = 0;

    while(x != 0){
      sum += x % 10;
      x /= 10;
    }

    return x % sum == 0 ? true : false;
  }
}
