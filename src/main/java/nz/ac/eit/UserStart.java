package nz.ac.eit;

import java.util.Scanner;
import static java.lang.System.exit;

public class UserStart {
    public void playerStart() {
        UserInput userInput = new UserInput();

        SupportedInput input = null;
        System.out.println("Do you want to start a game(YES/NO)?");
        Scanner start = new Scanner(System.in);
        String inputAsString = start.nextLine().toUpperCase();
        try{
            input = userInput.collectInput(inputAsString);
        } catch (InputNotSupportedException inse) {
            System.out.println(inse.getMessage());
        }
        if (inputAsString.equals("NO")) {
            exit(0);
        }
    }
}