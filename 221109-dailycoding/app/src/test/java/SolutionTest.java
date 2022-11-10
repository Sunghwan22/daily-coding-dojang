import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example() {
        Solution solution = new Solution();

        assertEquals(3, solution.solution(new int[]{70, 50, 80, 50}, 100));
        assertEquals(3, solution.solution(new int[]{70, 80, 50}, 100));
    }

    @Test
    void sort() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{50, 50, 70, 80}, solution.sortByWeight(new int[]{70, 50, 80, 50}));
    }
}
