import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example() {
        Solution solution = new Solution();

        assertEquals(5, solution.solution(4));
        assertEquals(3, solution.solution(3));
    }

    @Test
    void numberEqualOne() {
        Solution solution = new Solution();

        assertEquals(1,  solution.solution(1));
    }
}