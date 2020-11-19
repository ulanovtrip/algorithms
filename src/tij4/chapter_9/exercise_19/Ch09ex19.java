package tij4.chapter_9.exercise_19;
import java.util.*;

import static petrs.Utils.print;
import static petrs.Utils.println;

interface Game { void play(); }

interface GameFactory { Game getGame(); }

class TossACoin implements Game {
	public void play() {
		println("Game: " + getClass().getSimpleName());
		Random rand = new Random(128);
		int remaining = 10;
		for(int i = 0; i < 10; i++) {
			print("Remaining: " + remaining--);
			switch(rand.nextInt(9)) {
				case 0: 
				case 1: 
				case 2: 
				case 3: println("Heads!"); break;
				case 4:
				case 5:
				case 6:
				case 7: println("Tails!"); break;
				default: println("Edge!");
			}
		}
	}
}

class ThrowADice implements Game {
	public void play() {
		println("Game: " + getClass().getSimpleName());
		Random rand = new Random();
		int remaining = 10;
		for(int i = 0; i < 10; i++) {
			println("Remaining: " + remaining--);
			println("It's " + (rand.nextInt(6)+1) + "!");
		}
	}
}

class TossACoinFactory implements GameFactory {
	public Game getGame() {
		return new TossACoin();
	}
}

class ThrowADiceFactory implements GameFactory {
	public Game getGame() {
		return new ThrowADice();
	}
}

public class Ch09ex19 {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		s.play();
	}

	public static void main(String[] args) {
		playGame(new TossACoinFactory());
		println("");
		playGame(new ThrowADiceFactory());
	}

}

