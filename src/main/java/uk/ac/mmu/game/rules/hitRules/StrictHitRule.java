package uk.ac.mmu.game.rules.hitRules;

public class StrictHitRule {
    public boolean hitRule(int newPosition, int otherPlayerPosition) {
        return newPosition == otherPlayerPosition;
    }
}
