package nz.ac.eit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    /*
    Test ID 1
    */
    @Test
    @DisplayName("Roll Dice Test")
    void rollDice () {
        Dice dice = new Dice ();
        int min = 2;
        int max = 12;
        for (int cnt = 0; cnt < 100; cnt++ ) {
            int total = dice.roll();
            assertTrue(max >= total, "Too high");
            assertTrue(min <= total, "Too low");
        }
    }

}
