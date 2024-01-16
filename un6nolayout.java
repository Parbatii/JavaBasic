import javax.swing.*;
//import javax.swing.JFrame;
public class un6nolayout {
    public static void main(String[]args){

        //create jframe (window)
        JFrame frame = new JFrame("No layout example:");
        frame.setSize(300,200);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create button
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");

        button1.setBounds(50,50,80,30);
        button3.setBounds(150,50,80,30);
        button2.setBounds(150,150,80,30);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}
