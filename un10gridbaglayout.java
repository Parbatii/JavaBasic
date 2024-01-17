import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.*;
public class un10gridbaglayout {
    public static void main(String[]args){
        JFrame frame = new JFrame("example");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 =  new JButton("button1");
        JButton b2 =  new JButton("button2");
        JButton b3 =  new JButton("button3");
        JButton b4 =  new JButton("button4");

        GridBagLayout gridbaglayout = new GridBagLayout();
        frame.setLayout(gridbaglayout);

        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        frame.add(b1,g);

        g.gridx = 1;
        g.gridy = 1;
        frame.add(b2,g);

        g.gridx = 2;
        g.gridy = 2;
        frame.add(b3,g);

        g.gridx = 3;
        g.gridy = 3;
        frame.add(b4,g);

        frame.setVisible(true);

    }
}

