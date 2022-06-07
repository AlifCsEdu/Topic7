import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Salesreporter extends JFrame implements ActionListener{

    private Container contentPane;
    private JButton btnCalculate;
    private JLabel lblSale;
    private JTextField txtSale;
    private FlowLayout layout;

    public Salesreporter() {
        //set up GUI
        super("MontlySales Tax Repoter");
        layout = new FlowLayout();

        //get content pane and set its layout
        contentPane = getContentPane();
        contentPane.setLayout(layout);

        //set up Label
        lblSale = new JLabel("Enter the total sales :");

        //set up textfield
        txtSale = new JTextField(7);

        //set up button
        btnCalculate = new JButton("Calculate sales tax");

        //add to Container
        contentPane.add(lblSale);
        contentPane.add(txtSale);
        contentPane.add(btnCalculate);

        //register listener
        btnCalculate.addActionListener(this);

        setLocationRelativeTo(null);
        setSize(250,100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
            public void actionPerformed(ActionEvent e) {
                double Sale = Double.parseDouble(txtSale.getText());
                if (e.getSource() == btnCalculate){
                    double countySale = Sale * 0.20;
                    double stateSale = Sale * 0.40;
                    double totalSale = countySale + stateSale;

                    JOptionPane.showMessageDialog(null,"\tCountry Sale tax = :RM" + countySale +
                            "\n\tState Sales Tax = :RM" + stateSale +
                            "\n\tTotal Sales Tax = :RM" + totalSale);
                }
    }
    public static void main(String[] args) {
        Salesreporter frame = new Salesreporter();
    }

}


