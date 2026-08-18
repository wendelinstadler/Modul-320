package acountAplication;

import java.util.Scanner;
public class AcountAplication {

    public static void main(String[] args) {
        System.out.println("Welcome to the account application");
        Acount sparkonto = new Acount(100);


        double amount = 0;
        String command = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What Acount should be used:");
            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = scanner.nextDouble();
            if (amount != 0) {
                System.out.println("To deposit, press +, to withdraw press -");
                command = scanner.next();
                if (command.equals("+")) {
                    sparkonto.deposit(amount);
                } else if (command.equals("-")) {
                    sparkonto.withdraw(amount);
                }
            }
        } while (amount != 0);
        System.out.println("Final balance:" + sparkonto);
    }
}
