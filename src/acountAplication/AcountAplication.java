package acountAplication;

import java.util.Scanner;
public class AcountAplication {
    public static void main(String[] args) {
        Acount Konto = new Acount();
        System.out.println("Welcome to the account application");
        double amount = 0;
        String command = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = scanner.nextDouble();
            if (amount != 0) {
                System.out.println("To deposit, press +, to withdraw press -");
                command = scanner.next();
                if (command.equals("+")) {
                    Konto.deposit(amount);
                } else if (command.equals("-")) {
                    Konto.withdraw(amount);
                }
            }
        } while (amount != 0);
        System.out.println("Final balance:" + Konto);
    }

}