import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class un12SumSwing extends JFrame implements ActionListener
{
    JLabel label1, label2, label3;
    JTextField textField1, textField2, textField3;
    JButton button;
    public un12SumSwing()
    {
        label1 = new JLabel("Enter first number:");
        textField1 = new JTextField(10);
        label2 = new JLabel("Enter second number:");
        textField2 = new JTextField(10);
        button = new JButton("Add");
        label3 = new JLabel("Result:");
        textField3 = new JTextField(10);
        button.addActionListener(this); add(label1);
        add(textField1); add(label2); add(textField2);
        add(button); add(label3); add(textField3);
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());
        int sum = num1 + num2;
        textField3.setText(Integer.toString(sum));
    }
    public static void main(String[] args)
    {
        new un12SumSwing();
    }
}