package eecs1022.lab4;

/**
 * Created by user on 2/17/18.
 */
public class Account
{






    private double balance;

    public Account ( double init_balance){
        this.balance = init_balance;

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
