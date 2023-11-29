package app;

import java.util.Scanner;

public class DataProvider {
    private Scanner input;

    public Calculate getCalculatedData() {
        input = new Scanner(System.in);
        System.out.println("Please, enter the number :");
        int number = input.nextInt();
        System.out.println("Please, enter the bet :");
        double bet = input.nextDouble();
        return new Calculate(number, bet);
    }

    public void closeScanner(){
        input.close();
    }
}
