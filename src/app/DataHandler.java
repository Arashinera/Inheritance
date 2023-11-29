package app;

public class DataHandler {

    private static final String CURRENCY = "USD";
    private Calculate calculate;
    private int number;
    private double bet;
    private double sum;

    public String handleCalculatedData(Calculate cal){
        calculate = new Calculate(number, bet);
        number = cal.getNumber();
        bet = cal.getBet();
        sum = calculate.getSum(number, bet);
        System.out.println("Your winning");
        return "Your winning prize is " + sum + " " + CURRENCY;
    }
}
