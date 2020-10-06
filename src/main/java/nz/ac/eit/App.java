package nz.ac.eit;

import java.util.Scanner;
import static java.lang.System.exit;

public class App
{
    public static void main( String[] args ) {
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

        String playerStart;
        System.out.println("Do you want to start a game(y/n)?");
        Scanner start = new Scanner(System.in);
        playerStart = start.nextLine();
        if (playerStart.equals("n")) {
            exit(0);
        }

        do {

            System.out.println("Players turn:\n");

            //Players first dice rolls.
            int playerTotal = 0;
            playerTotal += rollDice();
            System.out.println("Player total score is: " + playerTotal);

            //Player choice and dice rolls.
            String playerChoice;
            do {
                //Ask player input.
                System.out.println("Do you want to roll again(y/n)?");
                Scanner scanner = new Scanner(System.in);
                playerChoice = scanner.nextLine();

                //Roll dice if player wants to 'hit'.
                if (playerChoice.equals("y")) {
                    playerTotal += rollDice();
                    System.out.println("Player total score is: " + playerTotal);
                }

                //Player automatic win or lose conditions.
                if (playerTotal == 21) {
                    System.out.println(playerTotal + " PLAYER WINS!!! Congratulations.");
                    playerChoice = "n";
                } else if (playerTotal >= 21) {
                    System.out.println(playerTotal + " PLAYER LOSES!!! Sorry try again.");
                    playerChoice = "n";
                }

            } while (playerChoice.equals("y"));

            if (playerTotal < 21) {
                System.out.println("Computers turn:\n");

                //Computers choice to roll while there scores is less than player.
                int computerTotal = 0;
                do {
                    computerTotal += rollDice();
                } while (computerTotal <= playerTotal);

                //Computer automatic win or lose conditions.
                System.out.println("Computers total score is: " + computerTotal);
                if (computerTotal > 21) {
                    System.out.println(computerTotal + "COMPUTER LOSES!!!");
                } else if (computerTotal == 21 || computerTotal > playerTotal) {
                    System.out.println(computerTotal + "COMPUTER WINS!!!");
                }
            }
            System.out.println("Do you want to start a new game(y/n)?");
            Scanner scanner = new Scanner(System.in);
            playerStart = scanner.nextLine();
            if (playerStart.equals("n")) {
                exit(0);
            }

        } while (playerStart.equals("y")) ;

    }
    //Roll dice function
    private static int rollDice()
    {
        int dice = 0;
        int total = 0;
        for (int cnt = 0; cnt < 2; cnt++)
        {
            dice = (int) Math.floor(Math.random() * 6 + 1);
            System.out.println("Dice roll = " + dice);
            total += dice;
        }
        return total;
    }
}

