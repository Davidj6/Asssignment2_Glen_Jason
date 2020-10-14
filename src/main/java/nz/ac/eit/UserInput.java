package nz.ac.eit;

import java.util.Scanner;

public class UserInput {
    public SupportedInput collectInput (String inputAsString) throws InputNotSupportedException {

        SupportedInput input = null;
        try {
            input = SupportedInput.valueOf(inputAsString.toUpperCase());
        } catch (IllegalArgumentException iae) {
            throw new InputNotSupportedException(inputAsString);
        }
        return input;
    }
}
