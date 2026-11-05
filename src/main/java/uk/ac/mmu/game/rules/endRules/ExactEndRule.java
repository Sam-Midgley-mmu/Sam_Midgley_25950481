package uk.ac.mmu.game.rules.endRules;

public class ExactEndRule implements EndRule {
    @Override
    public int apply(int currentPosition, int roll, int endPosition) {
        int newPosition = Math.min(currentPosition + roll, endPosition);
        if (newPosition == endPosition)
            return endPosition;

        if (newPosition > endPosition) return endPosition - (newPosition - endPosition);

        return newPosition;
    }
}
/*
This should bounce the player back by the amount they overshot the end position */