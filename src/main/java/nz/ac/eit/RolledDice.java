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

    public int  rolledNumber(String numberAsString) throws NumberNotAnIntegerException, NumberNotInAValidRangeException {
        int numberedDice = RolledDice.rollDice();
        try {
            numberedDice = Integer.parseInt(numberAsString);
        }
        catch (NumberFormatException nfe) {
            throw new NumberNotAnIntegerException(numberAsString);
        }
        if (numberedDice < 1 || numberedDice > 12) {
            throw new NumberNotInAValidRangeException(numberedDice);
        }
        return numberedDice;
    }
}
