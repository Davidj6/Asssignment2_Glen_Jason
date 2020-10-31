package nz.ac.eit;


public class Game {

    int playerTotal;
    int computerTotal;
    Dice dice = new Dice();

    public Game() {
        playerTotal = 0;
        computerTotal = 0;
    }

    public void Start()
    {
        PlayerTurn();
        ComputerTurn();
    }

    public void PlayerTurn()
    {
        playerTotal += dice.roll();
        System.out.println("Player total score is: " + playerTotal);

        boolean playerChoice;

        do {
            System.out.println("Do you want to roll again (YES/NO)? ");
            playerChoice = PlayerResponse.YesOrNo();
            if (playerChoice) {
                playerTotal += dice.roll();
                System.out.println("Player total score is: " + playerTotal);
            }
            CheckScore();
            if (playerTotal == 21) playerChoice = false;
        } while (playerChoice);
    }

    public void ComputerTurn()
    {
        do {
            computerTotal += dice.roll();
        } while (computerTotal <= playerTotal && playerTotal != 21);

        System.out.println("Computers total score is: " + computerTotal);
        CheckScore();
    }

    public void CheckScore()
    {
        if (playerTotal == 21) {
            System.out.println(" YOU WIN!!! Congratulations. Blackjack!!");
        } else if (playerTotal > 21) {
            System.out.println(" YOU LOSE!!! Sorry try again. Bust!");
        } else if (computerTotal > 21) {
            System.out.println(" YOU WIN!!! Congratulations."); // Computer loses ( by going bust trying to beat player score )
        } else if (computerTotal == 21 ) {
            System.out.println(" YOU LOSE!!! Sorry try again. Computer got Blackjack"); // Computer wins ( computer hits blackjack - we assume that player hasn't hit 21.
        } else if ( computerTotal > playerTotal) {
            System.out.println(" YOU LOSE!!! Sorry try again."); // Computer wins ( by have a higher score than player without going over 21 - we assume that player hasn't hit 21.
        }

    }

}
