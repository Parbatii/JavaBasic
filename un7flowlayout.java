import java.awt.FlowLayout;
import javax.swing.*;
public class un7flowlayout {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setSize(300, 200); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on window close

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Set layout manager to FlowLayout
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Make the window visible
        frame.setVisible(true);
    }

}
