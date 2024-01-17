import java.awt.GridLayout;
import javax.swing.*;
public class un9gridlayout {
    public static void main(String[]args){

        JFrame frame = new JFrame("example of gridlayout");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 =  new JButton("Button1");
        JButton b2 =  new JButton("Button2");
        JButton b3 =  new JButton("Button3");
        JButton b4 =  new JButton("Button4");
        JButton b5 =  new JButton("Button5");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        GridLayout gridlayout = new GridLayout(3,2,3,3);
        frame.setLayout(gridlayout);

        frame.setVisible(true);
    }
}

