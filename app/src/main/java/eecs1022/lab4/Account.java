package eecs1022.lab4;

/**
 * Created by user on 2/17/18.
 */
public class Account
{
    double amt;


    double getamt(){
        amt = amt;
        return amt;
    }

    public double getAmt()
    {
        return amt;
    }

    public void setAmt(double amt)
    {
        this.amt = amt;
    }

    private double balance;

    public Account ( double init_balance, double aamt){
        this.balance = init_balance;
        this.amt=aamt;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){
        balance += amt;

    }
    public void withdraw ( double amt){
        balance -= amt;

    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }


}
