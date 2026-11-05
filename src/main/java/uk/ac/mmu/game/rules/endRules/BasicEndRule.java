package uk.ac.mmu.game.rules.endRules;

public class BasicEndRule implements EndRule {
    @Override
    public int apply(int currentPosition, int roll, int endPosition) {
        return Math.min(currentPosition + roll, endPosition);
    }
}


/* TO DO - implement game end rule so that when either player reaches the end of the board (25 for red, 1 for blue),
The game ends and the player wins */