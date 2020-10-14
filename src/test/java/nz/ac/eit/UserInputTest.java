package nz.ac.eit;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserInputTest {

    @Test(expected = InputNotSupportedException.class)
    public void collectInput_withUnsupportedInput_shouldThrowException() throws InputNotSupportedException {
        UserInput userInput=new UserInput();
        userInput.collectInput("NotYesOrNo");
    }

    @Test
    public void collectInput_withYes_shouldReturnYesSupportedInput() throws InputNotSupportedException {
        UserInput userInput=new UserInput();
        SupportedInput input=userInput.collectInput("yes");
        assertEquals(SupportedInput.YES,input);
    }

    @Test
    public void collectInput_withNo_shouldReturnNoSupportedInput() throws InputNotSupportedException {
        UserInput userInput=new UserInput();
        SupportedInput input=userInput.collectInput("no");
        assertEquals(SupportedInput.NO,input);
    }
}
