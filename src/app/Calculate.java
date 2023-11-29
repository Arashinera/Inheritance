package app;

public class Calculate extends Game{

    public Calculate(int number, double bet) {
        super(number, bet);
    }

    public double getSum(int number, double bet) {
        double tax;
        int winningRate;
        double sum;
        if (number > 0 && number < 3){
            winningRate = 125;
            sum = bet * winningRate / 100;
            return sum;
        } else if (number >= 3 && number <= 7) {
            winningRate = 125;
            tax = 5;
            sum = (bet - (bet * tax / 100)) * winningRate / 100;
            return sum;
        } else {
            winningRate = 200;
            tax = 10;
            sum = (bet * winningRate / 100) * (tax / 100 * 9);
            return sum;
        }
    }

}
