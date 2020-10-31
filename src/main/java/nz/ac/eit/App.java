package nz.ac.eit;

/*
 * <h1>Dice Blackjack!</h1>
 *
 * Player gets two dice rolls with scores added together.
 * With the aim of getting 21 if you go over you lose.
 * You have option to roll again if you wish or hold on first score.
 * If player gets 21 they are automatic winner.
 * If player gets over 21 they are automatic loser.
 * Player can roll two dice as many times as they want.
 * Then computer will have its turn.
 * Closest to 21 wins!
 *
 *
 * @author   Jason Davidson
 * @version  %I%, %G%
 * @since    1.0
 */
public class App {

    /**
     * This is the main method.
     * @param args Unused.
     */
    public static void main(String[] args) {
        Initialize();
    }

    /*
     * This static method initializes a new game.
     */
    private static void Initialize()
    {
        //Welcome Message.
        System.out.println("Welcome to Dice Blackjack!\n" +
                "Rules:\n" +
                "Player gets two dice rolls with scores added together.\n" +
                "With the aim of getting 21 if you go over you lose.\n" +
                "You have option to roll again if you wish or hold on first score.\n" +
                "If player gets 21 they are automatic winner.\n" +
                "If player gets over 21 they are automatic loser.\n" +
                "Player can roll two dice as many times as they want.\n" +
                "Then computer will have its turn.\n" +
                "Closest to 21 wins!\n\n"
        );

        Game game = new Game();
        game.Start();
    }

}


