package uk.ac.mmu.game.player;

public class Player {
    private final String name;
    private int position;

    public Player(String name, int startPosition) {
        this.name = name;
        this.position = startPosition;
    }

    public String getName() { return name; }
    public int getPosition() { return position; }

    public void moveTo(int newPos) {
        this.position = newPos;
    }
}