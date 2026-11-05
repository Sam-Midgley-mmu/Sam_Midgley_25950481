package uk.ac.mmu.game.dice;

import java.util.Random;

public class RandomSingleDiceShaker implements DiceShaker {
    private final Random random = new Random();

    @Override
    public int roll() {
        return random.nextInt(6) + 1;
    }
}