/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dailycoding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HashadNumberTest {
  @Test
  void digitsum() {
    int x = 18;
    int sum = 0;
    String[] number = String.valueOf(x).split("");

    for(int i = 0; i< number.length; i+=1){
      sum += Integer.parseInt(number[i]);
    }

    Assertions.assertEquals(9 , sum);
  }
  @Test
  void sampleTest() {
    HashadNumber hashadNumber = new HashadNumber();

    Assertions.assertTrue(hashadNumber.solution(10));
    Assertions.assertTrue(hashadNumber.solution(18));
    Assertions.assertFalse(hashadNumber.solution(11));
    Assertions.assertFalse(hashadNumber.solution(13));

  }
}
