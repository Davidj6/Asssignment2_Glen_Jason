package nz.ac.eit;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class RolledDiceTest {
    /**
    * Test ID 4
     */
    @Test
    public void rolledNumber_with7_shouldReturn7()  throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        RolledDice rolledDice=new RolledDice();
        int number=rolledDice.checkSum(7);
        assertEquals(7,number);
    }

    /**
     * Test ID 5
     */
    @Test(expected = NumberNotInAValidRangeException.class)
    public void rolledNumber_with13_shouldThrowException() throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        RolledDice rolledDice=new RolledDice();
        rolledDice.checkSum(13);
    }

    /**
     * Test ID 6
     */
    @Test(expected = NumberNotInAValidRangeException.class)
    public void rolledNumber_withNegativeOne_shouldThrowException() throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        RolledDice rolledDice=new RolledDice();
        rolledDice.checkSum(-1);
    }

    /**
     * Test ID 7
     */
    @Test
    public void addNewDiceRollToPreviousTotal() {
        RolledDice rolledDice = new RolledDice();
        boolean correct=rolledDice.secondRoll();
        assertTrue(correct);
    }

    /**
     * Test ID 8
     */
    @Test
    public void newDiceRollAfterPlayerAnswersYes() {
        RolledDice rolledDice = new RolledDice();
        boolean answerYes=rolledDice.playerRollYes();
        assertTrue(answerYes);
    }
}
