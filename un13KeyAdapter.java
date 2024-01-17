import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class un13KeyAdapter extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b;

    public un13KeyAdapter() {
        l1 = new JLabel("Enter 1st number:");
        t1 = new JTextField(10);
        l2 = new JLabel("Enter 2nd number:");
        t2 = new JTextField(10);
        b = new JButton("ADD");
        l3 = new JLabel("Result:");
        t3 = new JTextField(10);

        b.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);
        add(t3);

        keychecker keyChecker = new keychecker();
        t1.addKeyListener(keyChecker);
        t2.addKeyListener(keyChecker);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class keychecker extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            int num1, num2;
            try {
                num1 = Integer.parseInt(t1.getText());
                num2 = Integer.parseInt(t2.getText());
            } catch (NumberFormatException ex) {
                return; // Do nothing if the input is not a valid number
            }

            int sum = num1 + num2;
            t3.setText(Integer.toString(sum));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click if needed
    }

    public static void main(String[] args) {
        new un13KeyAdapter();
    }
}
