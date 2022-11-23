import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution(new int[]{3, 0, 6, 1, 5}));
    }
}
