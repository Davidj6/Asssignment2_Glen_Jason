package nz.ac.eit;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //Welcome Message.
        System.out.println( "Welcome to Dice Blackjack!\n" +
                "Rules:\n" +
                "Player gets two dice rolls with scores added together.\n" +
                "With the aim of getting 21 if u go over you lose.\n" +
                "You have option to roll again if u wish or hold on first score.\n" +
                "Then computer will have its turn.\n" +
                "Closest to 21 wins!\n" );

        //Players first dice rolls.
        Integer dice1 =  (int)Math.floor(Math.random() * 6 + 1);
        Integer dice2 = (int)Math.floor(Math.random()*6+1);
        Integer totalDice1 = dice1 + dice2;
        System.out.println("Players first dice rolls = " + totalDice1);

        //Player choice.
        System.out.println("Do you want to roll again(y/n)?");
        Scanner scanner = new Scanner(System.in);
        String playerChoice = scanner.nextLine();

        //If statement for outcome of players choice.
        Integer totalDice2 = 0;
        if (playerChoice.equals("y")){
            Integer dice3 =  (int)Math.floor(Math.random() * 6 + 1);
            Integer dice4 = (int)Math.floor(Math.random()*6+1);
            totalDice2 = dice3 + dice4;
            System.out.println("Players second dice rolls = " + totalDice2);
        }
        Integer playerTotalDiceScore = totalDice1 + totalDice2;
        System.out.println("Player total score is: " + playerTotalDiceScore);

        //Computers first dice rolls.
        System.out.println("Computers turn.\n");
        Integer dice5 =  (int)Math.floor(Math.random() * 6 + 1);
        Integer dice6 = (int)Math.floor(Math.random()*6+1);
        Integer totalDice3 = dice5 + dice6;
        System.out.println("Computers first dice rolls = " + totalDice3);

        //Computers choice.
        Integer totalDice4 = 0;
        if (totalDice3 <= 11){
            Integer dice7 =  (int)Math.floor(Math.random() * 6 + 1);
            Integer dice8 = (int)Math.floor(Math.random()*6+1);
            totalDice4 = dice7 + dice8;
            System.out.println("Computers second dice rolls = " + totalDice4);
        }
        Integer computerTotalDiceScore = totalDice3 + totalDice4;
        System.out.println("Computers total score is: " + computerTotalDiceScore);


    }
}

