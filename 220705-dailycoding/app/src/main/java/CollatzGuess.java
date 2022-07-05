import java.awt.*;

public class CollatzGuess {
  public int solution(long number) {

    int count = 0;

    if (number == 1) {
      return count;
    }

    while (number != 1) {
      if (number % 2 == 0) {
        number /= 2;
        count += 1;
        continue;
      }

      if (number % 2 != 0) {
        number = number * 3 + 1;
        count += 1;
        continue;
      }
    }
    if (count >= 500) {
      count = -1;
    }

    return count;
  }
}