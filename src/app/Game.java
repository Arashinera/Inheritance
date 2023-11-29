package app;

public class Game {
    private final int number;
    private final double bet;

    public Game(int number, double bet) {
        this.number = number;
        this.bet = bet;
    }

    public int getNumber() {
        return number;
    }

    public double getBet() {
        return bet;
    }

}