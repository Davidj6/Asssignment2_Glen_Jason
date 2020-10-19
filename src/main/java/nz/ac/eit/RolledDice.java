package nz.ac.eit;

public class RolledDice {
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

    public int checkSum(int sumOfDice) throws NumberNotAnIntegerException, NumberNotInAValidRangeException {

        if (sumOfDice < 1 || sumOfDice > 12) {
            throw new NumberNotInAValidRangeException(sumOfDice);
        }
        return sumOfDice;
    }
}
