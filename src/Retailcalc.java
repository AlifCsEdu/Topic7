import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Retailcalc extends JFrame implements ActionListener {

    private Container contentPane;
    private JLabel lblCost, lblMarkUp;
    private JButton btnCalc;
    private JTextField txtCost, txtMarkUp;
    private FlowLayout layout;

    public static void main(String[] args) {
        Retailcalc frame = new Retailcalc();
    }

    public Retailcalc() {
        //set up GUI
        super("Retail Price calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout = new FlowLayout();

        //get content pane and set its layout
        contentPane = getContentPane();
        contentPane.setLayout(layout);

        //set up Label
        lblCost = new JLabel("Enter the wholesale cost :");
        lblMarkUp = new JLabel("Enter the markup percentage (%) :");

        //set up textfield
        txtCost = new JTextField(5);
        txtMarkUp = new JTextField(5);

        //set up button
        btnCalc = new JButton("Calculate Retail Price");

        //add to Container
        contentPane.add(lblCost);
        contentPane.add(txtCost);
        contentPane.add(lblMarkUp);
        contentPane.add(txtMarkUp);
        contentPane.add(btnCalc);

        //register listener
        btnCalc.addActionListener(this);

        setLocationRelativeTo(null);
        setSize(300, 120);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        double cost = Double.parseDouble(txtCost.getText());
        double Markup = Double.parseDouble(txtMarkUp.getText());

        if (e.getSource() == btnCalc) {
            double total = cost + (cost * Markup / 100);
            JOptionPane.showMessageDialog(null, "The retail price is : $" + total);
        }
    }
}


