package uk.ac.mmu.game.game;

import uk.ac.mmu.game.board.Board;
import uk.ac.mmu.game.player.Player;
import uk.ac.mmu.game.dice.DiceShaker;
import uk.ac.mmu.game.rules.endRules.BasicEndRule;
import uk.ac.mmu.game.rules.endRules.EndRule;
import uk.ac.mmu.game.rules.endRules.ExactEndRule;

public class Game {

    private final Board board;
    private final Board largeBoard;
    private final Player red;
    private final Player blue;
    private final DiceShaker diceShaker;

    public Game(Board board, Board largeBoard, Player red, Player blue, DiceShaker diceShaker, EndRule basicEnd) {
        this.board = board;
        this.largeBoard = largeBoard;
        this.red = red;
        this.blue = blue;
        this.diceShaker = diceShaker;
    }

    public void play() {
        Player player1 = red;
        Player player2 = blue;

        while (true) {
            int roll = diceShaker.roll();
            int before = player1.getPosition();
            int after = before + roll;

            player1.moveTo(after);

            System.out.printf("%s rolls %d: %d -> %d%n",
                    player1.getName(), roll, before, after);

            if (after == (player1 == red ? board.getEndPositionForRed() : board.getEndPositionForBlue())) {
                System.out.println(player1.getName() + " wins!");
                break;
            }

            Player temp = player1;
            player1 = player2;
            player2 = temp;
        }
        EndRule basicEnd = new BasicEndRule();
        EndRule exactEnd = new ExactEndRule();
    }
}