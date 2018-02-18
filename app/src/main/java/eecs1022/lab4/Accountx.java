package eecs1022.lab4;

/**
 * Created by user on 2/18/18.
 */
public class Accountx
{
private double balance;
    private double amt;
    public void deposit(double amt){
        balance += amt;

    }
    public void withdraw ( double amt){
        balance -= amt;

    }
    public Accountx(double init_balance, double amount){
        this.balance = init_balance;
        this.amt = amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getAmt()
    {
        return amt;
    }

    public void setAmt(double amt)
    {
        this.amt = amt;
    }

}
