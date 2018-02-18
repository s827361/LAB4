package eecs1022.lab4;

/**
 * Created by user on 2/18/18.
 */
public class Customerx
{
    private String Name;
    private String service;
    private Accountx accountx;
    private String from;
    private String to;
    public Customerx (String n, String s, String f, String t){
        this.Name = n;
        this.service = s;
        this.from=f;
        this.to= t;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getTo()
    {
        return to;
    }

    public void setTo(String to)
    {
        this.to = to;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getService()
    {
        return service;
    }

    public void setService(String service)
    {
        this.service = service;
    }

    public Accountx getAccountx()
    {
        return accountx;
    }

    public void setAccountx(Accountx accountx)
    {
        this.accountx = accountx;
    }
    public String toString1(){
        String s = "";

             s = "";
            double a = this.getAccountx().getBalance();
            double b = this.getAccountx().getAmt();
            double c = a - b;
            String cc = String.format("%.2f", c);
            s += "Client" + this.Name + "has balance" + cc;







        return s;
    }
    public String toString2(){
        String s = "";
        double a = this.getAccountx().getBalance();
        double b = this.getAccountx().getAmt();
        double c = a + b;
        String cc = String.format("%.2f", c);
        s += "Client" + this.Name + "has balance" + cc;
        return s;
    }
}
