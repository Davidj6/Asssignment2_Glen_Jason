package nz.ac.eit;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameTest {

    /*
    Test ID 2
     */
    @Test
    @DisplayName("Test Computer Bust")
    public void checkScoreComputerBust()
    {
        System.out.println( "Test Computer Bust" );
        Game game = new Game();
        game.playerTotal = 18;
        game.computerTotal = 22;
        game.CheckScore();
        System.out.println( "T: PlayerTotal: " + game.playerTotal );
        System.out.println( "T: ComputerTotal: " + game.computerTotal );
    }

    /*
    Test ID 3
     */
    @Test
    @DisplayName("Test Computer Blackjack")
    public void checkScoreComputerBlackjack()
    {
        System.out.println( "Test Computer Blackjack" );
        Game game = new Game();
        game.playerTotal = 18;
        game.computerTotal = 21;
        game.CheckScore();
        System.out.println( "T: PlayerTotal: " + game.playerTotal );
        System.out.println( "T: ComputerTotal: " + game.computerTotal );
    }

    /*
    Test ID 4
     */
    @Test
    @DisplayName("Test Player Blackjack")
    public void checkScorePlayerBlackjack()
    {
        System.out.println( "Test Player Blackjack" );
        Game game = new Game();
        game.playerTotal = 21;
        game.computerTotal = 0;
        game.CheckScore();
        System.out.println( "T: PlayerTotal: " + game.playerTotal );
        System.out.println( "T: ComputerTotal: " + game.computerTotal );
    }

    /*
    Test ID 5
     */
    @Test
    @DisplayName("Test Player Bust")
    public void checkScorePlayerBust()
    {
        System.out.println( "Test Player Bust" );
        Game game = new Game();
        game.playerTotal = 22;
        game.computerTotal = 0;
        game.CheckScore();
        System.out.println( "T: PlayerTotal: " + game.playerTotal );
        System.out.println( "T: ComputerTotal: " + game.computerTotal );
    }

    /*
    Test ID 6
     */
    @Test
    @DisplayName("Test Player Win")
    public void checkScorePlayerWin()
    {
        System.out.println( "Test Player Win" );
        Game game = new Game();
        game.playerTotal = 20;
        game.computerTotal = 18;
        game.CheckScore();
        System.out.println( "T: PlayerTotal: " + game.playerTotal );
        System.out.println( "T: ComputerTotal: " + game.computerTotal );
    }

    /*
    Test ID 7
     */
    @Test
    @DisplayName("Test Computer Win")
    public void checkScoreComputerWin()
    {
        System.out.println( "Test Computer Win" );
        Game game = new Game();
        game.playerTotal = 18;
        game.computerTotal = 20;
        game.CheckScore();
        System.out.println( "T: PlayerTotal: " + game.playerTotal );
        System.out.println( "T: ComputerTotal: " + game.computerTotal );
    }

    /*
    Test ID 8
     */
    @Test
    @DisplayName("Test Computer Turn")
    public void computerTurnTest()
    {
        System.out.println( "Test Computer Turn" );
        Game game = new Game();
        game.playerTotal = 18;
        game.ComputerTurn();
    }

    /*
    Test ID 9
     */
    @Test
    @DisplayName("Test Player Turn")
    public void playerTurnTest()  {
        System.out.println( "Test Player Turn" );
        Game game = new Game();
        String inputData = "NO";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        game.PlayerTurn();
    }

    /*
    @Test
    @DisplayName("Test Start")
    public void StartTest()  {
        System.out.println( "Test Start" );
        Game game = new Game();
        String inputData = "YES" + System.getProperty("line.separator")
                + "NO" + System.getProperty("line.separator");
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        game.Start();
    }

     */

}
