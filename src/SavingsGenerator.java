import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import static java.lang.Math.pow;

public class SavingsGenerator extends JFrame implements ActionListener {
    private JLabel lblAmount, lblInterest, lblYear;
    private JButton btnCalc;
    private JTextField txtAmount, txtInterest, txtYear, txtBalance;
    private Container cont;
    private GridLayout layout;

    public SavingsGenerator(){
        super("The Savings Account Calculator");
        layout = new GridLayout(5,2);

        //Get content pane and it's layout
        cont = getContentPane();
        cont.setLayout(layout);

        //Set up label
        lblAmount = new JLabel("Enter the initial amount of a savings account : ");
        lblInterest = new JLabel("Enter the annual interest rate : ");
        lblYear = new JLabel("Enter the number of years  : ");

        //Set up text field
        txtAmount = new JTextField(7);
        txtInterest = new JTextField(7);
        txtYear = new JTextField(7);
        txtBalance = new JTextField (7);

        //Set up button
        btnCalc = new JButton( "Calculate");

        //Add to container
        cont.add(lblAmount);
        cont.add(txtAmount);
        cont.add(lblInterest);
        cont.add(txtInterest);
        cont.add(lblYear);
        cont.add(txtYear);
        cont.add(btnCalc);
        cont.add(txtBalance);

        //Register listener
        btnCalc.addActionListener(this);

        setLocationRelativeTo(null);
        setSize(450,175);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        DecimalFormat dec = new DecimalFormat("#0.00");
        double p = Double.parseDouble(txtAmount.getText());
        double r = Double.parseDouble(txtInterest.getText());
        double n = Double.parseDouble(txtYear.getText());
        if(e.getSource()== btnCalc){
            double balance = p * pow ((1+r), n);

            txtBalance.setText("The balance of the savings account is RM" + dec.format(balance));
        }
    }
    public static void main (String args[]){
        SavingsGenerator saving = new SavingsGenerator();
    }
}
