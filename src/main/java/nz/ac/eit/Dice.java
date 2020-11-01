package nz.ac.eit;

/*
 * This simulates the roll of a single or multiple dice of a specified size
 * and returns the sum to the caller.
 * Limitation: The number of the sides is hardcoded restricting the ability to
 * account for dice of various sizes. This was done to keep this class simple
 * and prevent the need to incorporate additional checks necessary to stay robust.
 * Limitation: The quantity of the dice is hardcoded restricting the ability to
 * account for various number of dice rolls. This was done to keep this class simple
 * and prevent the need to incorporate additional checks necessary to stay robust.
 * Limitation: The text for each dice roll and the total of dice rolls is hardcoded
 * preventing multilingual or modified feedback.
 */
public class Dice {

    private int _sides;
    private int _quantity;

    public Dice()
    {
        _sides = 6;
        _quantity = 2;
    }

    /*
     * Roll the Dice
     * @return   <code>true</code> If a valid response was entered and it began with 'Y'
     *           <code>false</code> otherwise.
     * @since    1.0
     */
    public int roll()
    {
        int dice = 0;
        int total = 0;
        for (int cnt = 0; cnt < _quantity; cnt++)
        {
            dice = (int) Math.floor(Math.random() * _sides + 1);
            System.out.println("Dice roll = " + dice);
            total += dice;
        }
        System.out.println("Dice total = " + total);
        return total;
    }
}
