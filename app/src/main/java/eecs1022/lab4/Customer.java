package eecs1022.lab4;

/**
 * Created by user on 2/17/18.
 */
public class Customer
{
    private String Name;
    private String service;



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
    public String toString1(){
        String s = "";
        double a = this.getAccount().getBalance();
        double b = this.getAccount().getAmt();
        double c = a + b;
        String cc = String.format("%.2f",c);
        s += "Client" + this.Name + "has balance"+ cc;


        return s;

    }
    public String toString2(){
        String s = "";
        double a = this.getAccount().getBalance();
        double b = this.getAccount().getAmt();
        double c = a - b;
        String cc = String.format("%.2f",c);
        s += "Client" + this.Name + "has balance"+ cc;


        return s;

    }

}
