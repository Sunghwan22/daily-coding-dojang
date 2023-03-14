import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{0, 1, 3, 4}, solution.solution(
            new String[]{".#...", "..#..", "...#."}
        ));
    }
}