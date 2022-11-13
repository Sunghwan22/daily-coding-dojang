import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void initDictionary() {
        Solution solution = new Solution();

        assertEquals(25, solution.initDictionary());
    }

}