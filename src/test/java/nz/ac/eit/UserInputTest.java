package nz.ac.eit;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserInputTest {

    @Test(expected = InputNotSupportedException.class)
    public void collectInput_withUnsupportedInput_shouldThrowException() throws InputNotSupportedException {
        UserInput userInput=new UserInput();
        userInput.collectInput("NotYesOrNo");
    }
}
