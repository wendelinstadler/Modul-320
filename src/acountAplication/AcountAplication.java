package acountAplication;

import java.util.Scanner;
public class AcountAplication {

    public static void main(String[] args) {
        System.out.println("Welcome to the account application");
        double kontostand = 0;
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
                    kontostand = deposit(kontostand, amount);
                } else if (command.equals("-")) {
                    kontostand = withdraw(kontostand, amount);
                }
            }
        } while (amount != 0);
        System.out.println("Final balance:" + kontostand);
    }
    public static double deposit(double kontostand, double amount){
        return kontostand + amount;
    }
    public static double withdraw(double kontostand, double amount){
        return kontostand - amount;
    }
}
