package uk.ac.mmu.game;

import uk.ac.mmu.game.board.Board;
import uk.ac.mmu.game.dice.*;
import uk.ac.mmu.game.game.Game;
import uk.ac.mmu.game.player.Player;
import uk.ac.mmu.game.rules.endRules.BasicEndRule;
import uk.ac.mmu.game.rules.endRules.ExactEndRule;
import uk.ac.mmu.game.rules.endRules.EndRule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		// Boards
		Board board = new Board(5, 5, Map.of());
		Board largeBoard = new Board(6, 6, Map.of());

		// Players
		Player player1 = new Player("Red", 1);
		Player player2 = new Player("Blue", 25);

		// Dice
		DiceShakerFactory singleDiceFactory = new SingleDiceFactory();

		DiceShakerFactory doubleDiceFactory = new DoubleDiceFactory();

		// END RULES
		EndRule basicEnd = new BasicEndRule();
		EndRule exactEnd = new ExactEndRule();

		// --- BASIC GAME ---
		System.out.println("=== BASIC END RULE ===");
		Game gameBasic = new Game(board, largeBoard,
				new Player("Red", 1),
				new Player("Blue", 25),
				doubleDiceFactory.create(),
				basicEnd);
		gameBasic.play();

		// --- BASIC GAME - SINGLE DIE ---
		System.out.println("\n=== BASIC END RULE - SINGLE DIE ===");
		Game gameBasicSingleDie = new Game(board, largeBoard,
				new Player("Red", 1),
				new Player("Blue", 25),
				singleDiceFactory.create(),
				basicEnd);
		gameBasicSingleDie.play();

		// --- EXACT END RULE ---
		System.out.println("\n=== EXACT END RULE ===");
		Game gameExact = new Game(board, largeBoard,
				new Player("Red", 1),
				new Player("Blue", 25),
				doubleDiceFactory.create(),
				exactEnd);
		gameExact.play();

		System.out.println("\nGame initialised.");
	}
}