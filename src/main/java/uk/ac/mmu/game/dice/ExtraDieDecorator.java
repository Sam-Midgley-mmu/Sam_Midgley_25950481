package uk.ac.mmu.game.dice;

import java.util.Random;

public class ExtraDieDecorator extends DiceShakerDecorator {

    private final Random random = new Random();

    public ExtraDieDecorator(DiceShaker shaker) {
        super(shaker);
    }

    @Override
    public int roll() {
        return shaker.roll() + random.nextInt(6) + 1;
    }

}


