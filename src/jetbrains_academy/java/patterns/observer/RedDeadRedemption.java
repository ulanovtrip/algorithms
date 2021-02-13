package jetbrains_academy.java.patterns.observer;

import java.util.*;

/**
 * Observable
 */
interface ObservableRdr {
    void addObserver(ObserverRdr observer);

    void removeObserver(ObserverRdr observer);

    void notifyObservers();
}

/**
 * Concrete Observable
 */
class RockstarGamesRdr implements ObservableRdr {

    public String releaseGame;
    /**
     * write your code here ...
     */
    private final List<ObserverRdr> observers = new ArrayList<>();

    // write your code here ...
    public void notifyObservers() {
        for (ObserverRdr observer : observers) {
            System.out.println("Inform message to : " + observer);
            observer.update(releaseGame);
        }
    }

    public void addObserver(ObserverRdr observer) {
        // write your code here ...
        observers.add(observer);
    }

    public void removeObserver(ObserverRdr observer) {
        // write your code here ...
        observers.remove(observer);
    }

    public void release(String game) {
        this.releaseGame = game;
        /** write your code here ... */
        notifyObservers();
    }

}

/**
 * Observer
 */
interface ObserverRdr {
    public void update(String domain);
}

/**
 * Concrete Observer
 */
class GamerRdr implements ObserverRdr {

    private String name;
    private String reaction;
    /**
     * write your code here ...
     */

    private Set<String> games = new HashSet<>();

    public GamerRdr(String name, String reaction, RockstarGamesRdr game) {
        this.reaction = reaction;
        /** write your code here ... */
        this.reaction = reaction;
        this.name = name;
    }

    /**
     * write your code here ...
     */
    public void update(String game) {
        if (games.contains(game)) {
            System.out.println("What? They've already released this game ... I don't understand");
        } else {
            buyGame(game);
        }
    }

    public void buyGame(String game) {
        games.add(game);
        System.out.println(name + " says : " + reaction);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

/**
 * Main Class
 */

public class RedDeadRedemption {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        String game = null;

        /** write your code here ... */
        RockstarGamesRdr rockstarGamesRdr = new RockstarGamesRdr();

        GamerRdr garry1 = new GamerRdr("Garry Rose", "I want to pre-order", rockstarGamesRdr);
        GamerRdr peter2 = new GamerRdr("Peter Johnston", "Pinch me...", rockstarGamesRdr);
        GamerRdr helen3 = new GamerRdr("Helen Jack", "Jesus, it's new game from Rockstar!", rockstarGamesRdr);

        /** write your code here ... */
        rockstarGamesRdr.addObserver(garry1);
        rockstarGamesRdr.addObserver(peter2);
        rockstarGamesRdr.addObserver(helen3);

        game = scanner.nextLine();
        System.out.println("It's happened! RockstarGames releases new game - " + game + "!");

        /** write your code here ... */
        rockstarGamesRdr.release(game);

        scanner.close();
    }
}
