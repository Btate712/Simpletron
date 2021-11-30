import org.junit.Test;

import static org.junit.Assert.*;

public class SimpletronMemoryTest {
    @Test
    public void InitializesAllValuesToZero() {
        var memory = new SimpletronMemory();
        for (int i = 0; i < GlobalConstants.MEM_SIZE; i++) {
            assertEquals(memory.getWord(i), 0);
        }
    }

    @Test
    public void ThrowsExceptionWhenNegativeMemoryLocationRequested() {
        var memory = new SimpletronMemory();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            memory.getWord(-1);
        });

        String expectedMessage = "Out of range memory location provided.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void ThrowsExceptionWhenTooLargeMemoryLocationRequested() {
        var memory = new SimpletronMemory();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            memory.getWord(101);
        });

        String expectedMessage = "Out of range memory location provided.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
