package acountAplication;

public class Acount {
    private double balance;
    public Acount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
