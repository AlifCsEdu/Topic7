import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Arithmetic_calc extends JFrame implements ActionListener{

    private JTextField txtNum21, txtOutput, txtNum11;
    private JLabel lblNum11, lblNum21;
    private JButton btnADD, btnSUB, btnMUL, btnDIV, btnMOD;
    private Container cont;
    private FlowLayout layout;

    public static void main(String[] args) {
        Arithmetic_calc frame = new Arithmetic_calc();
    }

    public Arithmetic_calc() {
        //set up GUI
        super("ARITHMETIC CALC");
        layout = new FlowLayout();

        //get content pane and set its layout
        cont = getContentPane();
        cont.setLayout(layout);

        //set up Label
        lblNum11 = new JLabel("Enter first number : ");
        lblNum21 = new JLabel("\nEnter Second number : ");

        //set up textfield
        txtNum11 = new JTextField(10);
        txtNum21 = new JTextField(10);
        txtOutput = new JTextField(30);

        //set up button
        btnADD = new JButton("+");
        btnSUB = new JButton("-");
        btnMUL = new JButton("*");
        btnDIV = new JButton("/");
        btnMOD = new JButton("%");

        //add to Container
        cont.add(lblNum11, BorderLayout.WEST);
        cont.add(txtNum11, BorderLayout.EAST);
        cont.add(lblNum21, BorderLayout.WEST);
        cont.add(txtNum21, BorderLayout.EAST);
        cont.add(txtOutput);
        cont.add(btnADD, BorderLayout.SOUTH);
        cont.add(btnSUB, BorderLayout.SOUTH);
        cont.add(btnMUL, BorderLayout.SOUTH);
        cont.add(btnDIV, BorderLayout.SOUTH);
        cont.add(btnMOD, BorderLayout.SOUTH);

        //register listener
        btnADD.addActionListener(this);
        btnSUB.addActionListener(this);
        btnMUL.addActionListener(this);
        btnDIV.addActionListener(this);
        btnMOD.addActionListener(this);

        setLocationRelativeTo(null);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent e)
        {
            double num1 = Double.parseDouble(txtNum11.getText());
            double num2 = Double.parseDouble(txtNum21.getText());

            if (e.getSource() == btnADD) {
                double num3 = num1 + num2;
                txtOutput.setText(" " + num3);
            }else if (e.getSource() == btnSUB) {
                double num3 = num1 - num2;
                txtOutput.setText(" " + num3);
            }else if (e.getSource() == btnMUL) {
                double num3 = num1 * num2;
                txtOutput.setText(" " + num3);
            }else if (e.getSource() == btnDIV) {
                double num3 = num1 / num2;
                txtOutput.setText(" " + num3);
            }else if (e.getSource() == btnMOD) {
                double num3 = num1 * (num2/100);
                txtOutput.setText(" " + num3);
            }
        }
    }


