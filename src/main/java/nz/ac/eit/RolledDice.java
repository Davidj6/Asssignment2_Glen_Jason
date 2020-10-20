package nz.ac.eit;

public class RolledDice {
    //Roll dice function
    public int rollDice()
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

    public int checkSum(Integer sumOfDice) throws NumberNotAnIntegerException, NumberNotInAValidRangeException {

        if (sumOfDice < 1 || sumOfDice > 12) {
            throw new NumberNotInAValidRangeException(sumOfDice);
        }
        return sumOfDice;
    }

    public boolean secondRoll() {
        int playerTotal = 0;
        playerTotal += rollDice();
        System.out.println("Player total score is: " + playerTotal);
        int playerTotal2 = playerTotal;
        playerTotal2 += rollDice();
        System.out.println("Player total score is: " + playerTotal2);
        return(playerTotal2 > playerTotal);
    }

    public boolean playerRollYes() {
        String playerChoice ="YES";
        int playerTotal = 0;
        if (playerChoice.equals("YES")) {
            playerTotal += rollDice();
            System.out.println("Player total score is: " + playerTotal);
        }
        return(playerTotal > 0);
    }
}
