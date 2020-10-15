package nz.ac.eit;

import org.junit.Test;
import static org.junit.Assert.*;

public class RolledDiceTest {
    @Test
    public void rolledNumber_with7_shouldReturn7()  throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        RolledDice rolledDice=new RolledDice();
        int number=rolledDice.rolledNumber("7");
        assertEquals(7,number);
    }

    @Test(expected = NumberNotInAValidRangeException.class)
    public void rolledNumber_with13_shouldThrowException() throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        RolledDice rolledDice=new RolledDice();
        rolledDice.rolledNumber("13");
    }

    @Test(expected = NumberNotInAValidRangeException.class)
    public void rolledNumber_withNegativeOne_shouldThrowException() throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        RolledDice rolledDice=new RolledDice();
        rolledDice.rolledNumber("-1");
    }

    @Test(expected = NumberNotAnIntegerException.class)
    public void rolledNumber_withNotANumber_shouldThrowException() throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        RolledDice rolledDice=new RolledDice();
        rolledDice.rolledNumber("NotANumber");
    }
}
