package nz.ac.eit;

import java.util.EnumSet;
import java.util.Scanner;

/*
 * Request text input from a user. Assuming the text can be tainted, it is
 * compared against a valid list of responses such as Yes or No. If the
 * response does not contain a valid response or is null they should be
 * prompted again for a valid response. Upon a valid response, the method
 * will return a true or false value based on their binary choice of Yes or No.
 * In order for the response to be flexible, case is ignored and abbreviations
 * for both Yes and No answers will be accepted as well.
 * Limitation: Boolean responses are based upon the first character of valid
 * words, therefore, only valid enumerated responses beginning with 'Y' will
 * return a 'true' value. For example, using 'Qui' will return a 'false' value
 * even if the word is added to the list of valid responses.
 * Limitation: The prompt to enter a valid response after an invalid response
 * is hardcoded reducing the usefulness of multilingual implementation or
 * requesting responses other than Yes or No without additional modification.
 *
 * @author      Jason Davidson
 * @version     %I%, %G%
 * @since       1.0
 */
public class PlayerResponse {
    enum ValidResponses { YES, NO, Y, N }

    /*
     * Get text input from user on a Yes or No request.
     * @return   <code>true</code> If a valid response was entered and it began with 'Y'
     *           <code>false</code> otherwise.
     * @since    1.0
     */
    public static boolean YesOrNo()
    {
        EnumSet<ValidResponses> validResponsesEnumSet = EnumSet.allOf(ValidResponses.class);

        ValidResponses choice = null;

        Scanner scanner = new Scanner(System.in);

        boolean invalidInput;
        do {
            invalidInput = false;
            try {
                choice = ValidResponses.valueOf(scanner.nextLine().toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.out.println("Please enter a valid response (YES/NO).");
                invalidInput = true;
            }
        } while (invalidInput);

        return( choice.name().substring(0,1).equals("Y") );
    }

}
