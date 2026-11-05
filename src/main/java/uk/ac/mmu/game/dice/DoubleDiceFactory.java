package uk.ac.mmu.game.dice;

public class DoubleDiceFactory implements DiceShakerFactory{
    public DiceShaker create() {
        return new ExtraDieDecorator(
                new RandomSingleDiceShaker());
    }
}
