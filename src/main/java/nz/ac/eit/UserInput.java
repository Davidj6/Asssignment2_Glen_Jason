package nz.ac.eit;

import java.util.Scanner;

public class UserInput {
    public static String playerStart;

    public static void word(String arg) throws UserInputNullException {
        String playerStart;
        Scanner start = new Scanner(System.in);
        playerStart = start.nextLine();
        playerStart.equals(null);
    }
}
