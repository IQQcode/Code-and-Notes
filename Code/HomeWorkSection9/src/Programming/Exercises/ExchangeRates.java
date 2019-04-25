package Programming.Exercises;

import java.util.Date;

class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualIntersRate = 0.0;
    private int dateCreated = 0;

    public Account() { }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getDateCreated() {
        return dateCreated;
    }

    public double getAnnualIntersRate(double v) {
        return annualIntersRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterRate = annualIntersRate / 100 / 12;
        double monthlyInterest = balance * monthlyInterRate;
        return  withdraw();
    }
    public double withdraw() {
        return 0;
    }
    public double deposit() {
        int in = 0;
        double newBalance2 = this.balance + in;
        return newBalance2;
    }
}

public class ExchangeRates {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20.000);
        account.getAnnualIntersRate(4.5);
        //account.withdraw(2500);
        Date date = new Date();
        System.out.println("The Custumer Creat Account time is :" + date.toString());
        System.out.println("");
    }
}
