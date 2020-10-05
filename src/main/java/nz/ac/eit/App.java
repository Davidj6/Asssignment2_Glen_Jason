package nz.ac.eit;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        /*
        System.out.println( "Welcome to Dice Blackjack!\n" +
                "Rules:\n" +
                "Player gets two dice rolls with scores added together.\n" +
                "With the aim of getting 21 if u go over you lose.\n" +
                "You have option to roll again if u wish or hold on first score.\n" +
                "Then computer will have its turn.\n" +
                "Closest to 21 wins!" );

         */

        Integer dice1 =  (int)Math.floor(Math.random() * 6 + 1);
        Integer dice2 = (int)Math.floor(Math.random()*6+1);
        Integer totalDice1 = dice1 + dice2;
        System.out.println("Players first dice rolls = " + totalDice1);

        System.out.println("Do you want to roll again(y/n)?");
        Scanner scanner = new Scanner(System.in);
        String playerChoice = scanner.nextLine();

        Integer totalDice2 = 0;
        if (playerChoice.equals("y")){
            Integer dice3 =  (int)Math.floor(Math.random() * 6 + 1);
            Integer dice4 = (int)Math.floor(Math.random()*6+1);
            totalDice2 = dice3 + dice4;
            System.out.println("Players second dice rolls = " + totalDice2);
        }

        Integer totalDiceScore = totalDice1 + totalDice2;
        System.out.println("Player total score is: " + totalDiceScore);

    }
}

