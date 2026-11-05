package uk.ac.mmu.game.board;

import java.util.Map;

public class Board {
    private final int rows;
    private final int cols;
    private final Map<Integer, Integer> wormholes;

    public Board(int rows, int cols, Map<Integer, Integer> wormholes) {
        this.rows = rows;
        this.cols = cols;
        this.wormholes = wormholes;
    }

    public int getEndPositionForRed() {
        return rows * cols;
    }

    public int getEndPositionForBlue() {
        return 1;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public boolean hasWormhole(int position) {
        return wormholes.containsKey(position);
    }

    public int teleport(int position) {
        return wormholes.get(position);
    }

    @Override
    public String toString() {
        return "Board{" +
                "rows=" + rows +
                ", cols=" + cols +
                '}';
    }
}