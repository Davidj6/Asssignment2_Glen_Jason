package nz.ac.eit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerResponseTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    @DisplayName("Test Player Response")
    public void playerResponseTest()
    {
        provideInput("y");
        assertTrue(PlayerResponse.YesOrNo());
        provideInput("yes");
        assertTrue(PlayerResponse.YesOrNo());
        provideInput("Y");
        assertTrue(PlayerResponse.YesOrNo());
        provideInput("YES");
        assertTrue(PlayerResponse.YesOrNo());
        provideInput("n");
        assertFalse(PlayerResponse.YesOrNo());
        provideInput("no");
        assertFalse(PlayerResponse.YesOrNo());
        provideInput("N");
        assertFalse(PlayerResponse.YesOrNo());
        provideInput("NO");
        assertFalse(PlayerResponse.YesOrNo());
    }

    @Test
    @DisplayName("IllegalArgumentException Test")
    public void TestIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("Test");
        });
    }

    @Test
    @DisplayName("NoSuchElementException Test")
    public void TestNoSuchElementException()
    {
        provideInput("ya");
        assertThrows(NoSuchElementException.class, PlayerResponse::YesOrNo);
        provideInput("na");
        assertThrows(NoSuchElementException.class, PlayerResponse::YesOrNo);
        provideInput("YESSER");
        assertThrows(NoSuchElementException.class, PlayerResponse::YesOrNo);
        provideInput("NopE");
        assertThrows(NoSuchElementException.class, PlayerResponse::YesOrNo);
        provideInput("");
        assertThrows(NoSuchElementException.class, PlayerResponse::YesOrNo);

    }

}
