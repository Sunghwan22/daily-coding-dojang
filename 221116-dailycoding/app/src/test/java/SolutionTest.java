import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void matchRoundOne() {
        Solution solution = new Solution();

        assertEquals(1, solution.solution(6, 1, 2));
        assertEquals(1, solution.solution(6, 4, 3));
        assertEquals(1, solution.solution(6, 6, 5));
        assertEquals(1, solution.solution(6, 5, 6));
    }

    @Test
    void matchRoundTwo() {
        Solution solution = new Solution();

        assertEquals(2, solution.solution(4, 2, 4));
    }
}
