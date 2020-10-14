package nz.ac.eit;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserInputTest {

    @Test(expected = InputNotSupportedException.class)
    public void collectLanguage_withUnsupportedLanguage_shouldThrowException() throws InputNotSupportedException {
        UserInput userInput=new UserInput();
        userInput.collectInput("NotYesOrNo");
    }
}
