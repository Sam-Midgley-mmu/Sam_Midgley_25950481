package uk.ac.mmu.game.rules.wormholeRules;

import uk.ac.mmu.game.board.Board;

public class WormholeTeleportRules implements TeleportRule {

    private Board board;

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public int apply(int pos) {
        if (board != null && board.hasWormhole(pos)) {
            return board.teleport(pos);
        }
        return pos;
    }
}
