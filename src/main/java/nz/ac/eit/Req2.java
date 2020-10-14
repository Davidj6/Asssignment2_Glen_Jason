package nz.ac.eit;

import java.util.Scanner;
import static java.lang.System.exit;

public class Req2 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Scanner scan = new Scanner(System.in);

        String inputAsString = null;
        System.out.println("Do you want to start a game(YES/NO)?");
        inputAsString = ("no").toUpperCase();
        try {
            userInput.collectInput(inputAsString);
        } catch (InputNotSupportedException inse) {
            System.out.println(inse.getMessage());
            System.exit(1);
        }
        if (inputAsString.equals("NO")) {
            exit(0);
        }
    }
}