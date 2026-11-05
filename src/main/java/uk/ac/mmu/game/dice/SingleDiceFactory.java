package uk.ac.mmu.game.dice;

public class SingleDiceFactory implements DiceShakerFactory {
    public DiceShaker create() {
        return new RandomSingleDiceShaker();
    }
}
