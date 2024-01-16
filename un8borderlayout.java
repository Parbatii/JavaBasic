import java.awt.BorderLayout;
import javax.swing.*;
public class un8borderlayout {
    public static void main(String[]args){
        JFrame frame = new JFrame("borderlayout eg");
        frame.setSize(500,500);

        JButton b1= new JButton("East");
        JButton b2 = new JButton("West");
        JButton b3 = new JButton("North");
        JButton b4 = new JButton("South");
        JButton b5 = new JButton("Center");

        BorderLayout borderlayout = new BorderLayout();
        frame.setLayout(borderlayout);

        frame.add(b1, BorderLayout.EAST);
        frame.add(b2, BorderLayout.WEST);
        frame.add(b3, BorderLayout.NORTH);
        frame.add(b4, BorderLayout.SOUTH);
        frame.add(b5, BorderLayout.CENTER);

        frame.setVisible(true);

    }
}