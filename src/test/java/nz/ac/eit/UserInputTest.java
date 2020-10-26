package nz.ac.eit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test suite for User Inputs - "Do you want to start a game (YES or NO)?
 */
public class UserInputTest {
    /**
     * Test ID 1
     * User Input other than YES or NO
     * @throws InputNotSupportedException
     */
    @Test(expected = InputNotSupportedException.class)
    public void collectInput_withUnsupportedInput_shouldThrowException() throws InputNotSupportedException {
        UserInput userInput=new UserInput();
        userInput.collectInput("NotYesOrNo");
    }

    /**
     * Test ID 2
     * User Input YES
     */
    @Test
    public void collectInput_withYes_shouldReturnYesSupportedInput() throws InputNotSupportedException {
        UserInput userInput=new UserInput();
        SupportedInput input=userInput.collectInput("yes");
        assertEquals(SupportedInput.YES,input);
    }

    /**
     * Test ID 3
     * User Input NO
     */
    @Test
    public void collectInput_withNo_shouldReturnNoSupportedInput() throws InputNotSupportedException {
        UserInput userInput=new UserInput();
        SupportedInput input=userInput.collectInput("no");
        assertEquals(SupportedInput.NO,input);
    }
}
