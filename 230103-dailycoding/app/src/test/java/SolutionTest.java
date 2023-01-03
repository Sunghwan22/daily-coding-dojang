import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example() {
        Solution solution = new Solution();

        assertEquals(16, solution.solution(2554));
        assertEquals(6, solution.solution(16));
    }

}