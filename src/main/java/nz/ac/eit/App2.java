package nz.ac.eit;

public class App2
{
    public static void main( String[] args ) throws NumberNotInAValidRangeException, NumberNotAnIntegerException {
        UserStart startGame = new UserStart();
        UserInput userInput = new UserInput();
        RolledDice rolledDice = new RolledDice();
        //Welcome Message.
        System.out.println("Welcome to Dice Blackjack!\n" +
                "Rules:\n" +
                "Player gets two dice rolls with scores added together.\n" +
                "With the aim of getting 21 if u go over you lose.\n" +
                "You have option to roll again if u wish or hold on first score.\n" +
                "If player gets 21 they are automatic winner.\n" +
                "If player gets over 21 they are automatic loser.\n" +
                "Player can roll two dice as many times as they want.\n" +
                "Then computer will have its turn.\n" +
                "Closest to 21 wins!\n");

        startGame.playerStart();
        String inputAsString = "YES";
        do {

            System.out.println("Players turn:\n");

            //Players first dice rolls.
            int playerTotal = 0;
            playerTotal += rolledDice.rollDice();
            System.out.println("Player total score is: " + playerTotal);



        } while (inputAsString.equals("YES")) ;

    }

}
