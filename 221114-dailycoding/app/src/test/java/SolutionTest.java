import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void greatestCommonDivisor() {
        Solution solution = new Solution();

        assertEquals(2, solution.greatestCommonDivisor(2,6));
        assertEquals(2, solution.greatestCommonDivisor(6,8));
    }

    @Test
    void arrayLengthEqualOne() {
        Solution solution = new Solution();

        assertEquals(2, solution.solution(new int[]{2}));
    }

    @Test
    void example() {
        Solution solution = new Solution();

        assertEquals(168, solution.solution(new int[]{2,6,8,14}));
        assertEquals(6, solution.solution(new int[]{1,2,3}));
    }
}
