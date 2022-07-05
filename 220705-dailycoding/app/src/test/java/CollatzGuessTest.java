import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzGuessTest {
    @Test
    void even() {
        CollatzGuess collatzGuess = new CollatzGuess();

        assertEquals(1 , collatzGuess.solution(2));
    }
    @Test
    void oddNumber() {
        CollatzGuess collatzGuess = new CollatzGuess();

        assertEquals(10 , collatzGuess.solution(3));
    }
    @Test
    void sample() {
        CollatzGuess collatzGuess = new CollatzGuess();

        assertEquals(4 , collatzGuess.solution(16));
    }
}