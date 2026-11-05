package uk.ac.mmu.game.dice;

public abstract class DiceShakerDecorator implements DiceShaker {

    protected final DiceShaker shaker;

    public DiceShakerDecorator(DiceShaker shaker) {
        this.shaker = shaker;
    }
}
