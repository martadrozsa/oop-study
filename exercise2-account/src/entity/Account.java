package entity;

public class Account {
    private final Integer number;
    private String holder;
    private Double balance;

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance+= amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

}
