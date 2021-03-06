import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class SimpletronComputerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void printsWelcomeMessage() {
        var computer = new SimpletronComputer();
        computer.showWelcomeMessage();
        assertTrue(outContent.toString().contains("Welcome to Simpletron!"));
    }

    @Test
    public void welcomeMessageHasCorrectSpacing() {
        var computer = new SimpletronComputer();
        computer.showWelcomeMessage();
        assertTrue(outContent.toString().contains("(?). ***"));
    }
}
