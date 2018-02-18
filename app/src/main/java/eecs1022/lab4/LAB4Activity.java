package eecs1022.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LAB4Activity extends AppCompatActivity
{Customer customer;
    Account account;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);
    }
    private void setContentsOfTextView(int id, String newContents){
        View view=findViewById(id);
        TextView textView= (TextView) view;
        textView.setText(newContents);
    }
    private String getInputOfTextField(int id){
        View view =findViewById(id);
        EditText editText = (EditText) view;
        String input =editText.getText().toString();
        return input;

    }
    private String getItemSelected(int id){
        View view =findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;

    }
    public void setAccount(Account account)
    {
        this.account = account;
    }
    String Name1 = getInputOfTextField(R.id.Name1);
    String Name2 = getInputOfTextField(R.id.Name2);
    String Name3 = getInputOfTextField(R.id.Name3);
    String in1 = getInputOfTextField(R.id.in_balance1);
    String in2 = getInputOfTextField(R.id.in_balance2);
    String in3 = getInputOfTextField(R.id.in_balance3);
    double in11 = Double.parseDouble(in1);
    double in22 = Double.parseDouble(in2);
    double in33 = Double.parseDouble(in3);
    String amt1 = getInputOfTextField(R.id.AMT);
    double amt = Double.parseDouble(amt1);


    Customer p1 = new Customer (Name1);
    Customer p2 = new Customer(Name2);
    Customer p3 = new Customer (Name3);
    Account a1 = new Account(in11,amt);
    Account a2 = new Account(in22,amt);
    Account a3 = new Account(in33,amt);



    public void buttoncrclicked(View view){
    String Name1 = getInputOfTextField(R.id.Name1);
    String Name2 = getInputOfTextField(R.id.Name2);
    String Name3 = getInputOfTextField(R.id.Name3);
    String in1 = getInputOfTextField(R.id.in_balance1);
    String in2 = getInputOfTextField(R.id.in_balance2);
    String in3 = getInputOfTextField(R.id.in_balance3);
    double in11 = Double.parseDouble(in1);
    double in22 = Double.parseDouble(in2);
    double in33 = Double.parseDouble(in3);

    Customer p1 = new Customer (Name1);
    Customer p2 = new Customer(Name2);
    Customer p3 = new Customer (Name3);
    Account a1 = new Account(in11,amt);
    Account a2 = new Account(in22,amt);
    Account a3 = new Account(in33,amt);

        p1.setAccount(a1);
        p2.setAccount(a2);
        p3.setAccount(a3);
        setContentsOfTextView(R.id.result, p1.toString());
        setContentsOfTextView(R.id.result2, p2.toString());
        setContentsOfTextView(R.id.result3, p3.toString());

}
public void buttoncmclicked(View view){
    String se = getItemSelected(R.id.spinner);
    String from = getItemSelected(R.id.spinner2);
    String to = getItemSelected(R.id.spinner3);
    String amt1 = getInputOfTextField(R.id.AMT);
    double amt = Double.parseDouble(amt1);
    p1.setAccount(a1);
    p2.setAccount(a2);
    p3.setAccount(a3);
    setContentsOfTextView(R.id.result, p1.toString1());
    setContentsOfTextView(R.id.result2, p2.toString1());
    setContentsOfTextView(R.id.result3, p3.toString1());



    /*switch(se){
        case withdraw:
            double amt =Double.parseDouble(amt1);
            amt = amt * -1;
            break;
        case deposit:
            amt =Double.parseDouble(amt1);
            break;



    }
    */


}


}
