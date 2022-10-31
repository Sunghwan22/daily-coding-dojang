import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void findAllAliquots() {
    Solution test = new Solution();

    assertThat(test.findAllAliquots(24)).isEqualTo(List.of(24, 12, 8, 6, 4, 3, 2, 1));
  }

  @Test
  void compareToBrownSolutionCount() {
    Solution test = new Solution();

    assertThat(test.compareToBrownSolutionCount(new int[]{12, 2}, 24)).isFalse();
    assertThat(test.compareToBrownSolutionCount(new int[]{6, 4}, 24)).isTrue();
  }

  @Test
  void solution() {
    Solution test = new Solution();

    assertThat(test.solution(10, 2)).isEqualTo(new int[]{4, 3});
    assertThat(test.solution(8, 1)).isEqualTo(new int[]{3, 3});
    assertThat(test.solution(24, 24)).isEqualTo(new int[]{8, 6});
  }
}