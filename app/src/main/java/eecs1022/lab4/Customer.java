package eecs1022.lab4;

/**
 * Created by user on 2/17/18.
 */
public class Customer
{
    private String Name;




    private Account account;

    public Customer(String n){
        this.Name = n;
    }

    public String getName()
    {
        return Name;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setName(String name)
    {
        Name = name;
    }
    public String toString(){
        String s ="";
        double qq = this.getAccount().getBalance();
        String qqq = String.format("%.2f",qq);
        s += "Client" + this.Name + "has balance"+ qqq;
        return s;

    }

}
