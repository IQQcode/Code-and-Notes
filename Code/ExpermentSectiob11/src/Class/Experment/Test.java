package Class.Experment;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

class MyAccount {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> record = new ArrayList<>();

    public MyAccount() {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
        this.record = record;
    }

    public MyAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int ID) {
        id = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annual) {
        annualInterestRate = annual;
    }

    public Date getDate() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12.0;
    }

    /*public String getRecord() {
        String s = null;
        for(int i = 0; i < record.size(); i++) {
            s = s + record.get(i);
        }
        return s;
    }*/

    public ArrayList<Transaction> getRecord() {
        return record;
    }

    public void withDraw(double money) {
        if (balance >= money) {
            balance -= money;
            String description = "取款：" + money + "\t账户余额为：" + balance;
            record.add(new Transaction('W', money, balance, description));
        }else {
            System.out.println("余额不足，请充值...");
        }
    }

    public void deposit(double money) {
        if (money >= 0) {
            balance += money;
            String description = "存款：" + money + "\t账户余额为：" + balance;
            record.add(new Transaction('D', money, balance, description));
        }else {
            System.out.println("存取异常！！！");
        }
    }
}

class Transaction  {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount,
                       double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toStirng() {
        return "交易记录 " + description + "\t账户余额为：" + balance;
    }
}

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        MyAccount person = new MyAccount("张三",1234,5000);
        //能不能改为多线程的存取方式？？？
        person.setAnnualInterestRate(2.25);
        person.withDraw(502.3);
        person.withDraw(100);
        person.deposit(1000);
        person.deposit(50);

        System.out.println("Name : " + person.getName() + "\n利息为： "
                + person.getAnnualInterestRate() + "\n账户余额为： " +
                person.getBalance());

        ArrayList<Transaction> personRecode = person.getRecord();

        System.out.println("\n\t\t\t*** 交易记录 *** " );

        for(Transaction description : personRecode) {
            System.out.println(description.getDescription() +
                    "\t\t" + simpleDateFormat.format(date));
        }
    }
}

