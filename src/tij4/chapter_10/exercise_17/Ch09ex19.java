package tij4.chapter_10.exercise_17;

import java.util.Random;

import static petrs.Utils.print;
import static petrs.Utils.println;

interface Game {
    void play();
}

interface GameFactory {
    Game getGame();
}

class TossACoin implements Game {
    public void play() {
        println("Game: " + getClass().getSimpleName());
        Random rand = new Random(128);
        int remaining = 10;
        for (int i = 0; i < 10; i++) {
            print("Remaining: " + remaining--);
            switch (rand.nextInt(9)) {
                case 0:
                case 1:
                case 2:
                case 3:
                    println(" Heads!");
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    println(" Tails!");
                    break;
                default:
                    println(" Edge!");
            }
        }
    }

    public static GameFactory gameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new TossACoin();
        }
    };
}

class ThrowADice implements Game {
    public void play() {
        println("Game: " + getClass().getSimpleName());
        Random rand = new Random();
        int remaining = 10;
        for (int i = 0; i < 10; i++) {
            println("Remaining: " + remaining--);
            println("It's " + (rand.nextInt(6) + 1) + "!");
        }
    }

    public static GameFactory gameFactory = new GameFactory() {
        public Game getGame() {
            return new ThrowADice();
        }
    };
}

public class Ch09ex19 {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        s.play();
    }

    public static void main(String[] args) {
        playGame(ThrowADice.gameFactory);
        playGame(TossACoin.gameFactory);
    }
}

