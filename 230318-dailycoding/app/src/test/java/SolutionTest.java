import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{9, 4}, solution.solution(
            new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"}));

        assertArrayEquals(new int[]{-1}, solution.solution(
            new String[]{"AA"}, new String[]{"B"}));

        assertArrayEquals(new int[]{4,6}, solution.solution(
            new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"}));
    }
}