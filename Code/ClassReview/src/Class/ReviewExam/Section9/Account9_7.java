package Class.ReviewExam.Section9;
import java.util.Date;

class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualIntersRate = 0.0;
    private Date dateCreated;

    public Account() {
        this.id = id;
        this.balance = balance;
        this.annualIntersRate = annualIntersRate;
        this.dateCreated = dateCreated;
    }

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

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getAnnualIntersRate() {
        return annualIntersRate;
    }

    public double getMonthlyInterest() {
        return annualIntersRate / 12;
    }
    public boolean withdraw(double money) {
        if(balance >= money) {
            balance -= money;
            return  true;
        }else {
            return false;
        }
    }
    public boolean deposit(int money) {
        if(money > 0) {
            balance += money;
            return  true;
        }else {
            return false;
        }
    }
}

public class  Account9_7 {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        if(account.withdraw(2500))
            System.out.println("Witndraw money is Success!");
        else
            System.out.println("Witndraw money is Fail");

        if(account.deposit(2500))
            System.out.println("Deposit money is Success...");
        else
            System.out.println("Deposit money is Fail...");

        Date date = new Date();

        System.out.println("Balance:" + account.getBalance());
        System.out.println("Monthly interest:" +
                account.getMonthlyInterest()*account.getBalance());
        System.out.println("The Custumer Creat Account time is :"
                + date.toString());
    }
}

