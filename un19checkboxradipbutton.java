import java.awt.*;
import javax.swing.*;
public class un19checkboxradipbutton {
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("cb and rb");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JCheckBox checkbox1 = new JCheckBox("CheckBox1");
        JCheckBox checkbox2= new JCheckBox("CheckBox2");
        JCheckBox checkbox3 = new JCheckBox("CheckBox3");
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);


        JRadioButton radiobutton1 = new JRadioButton("RadioButton1");
        JRadioButton radiobutton2 = new JRadioButton("RadioButton2");
        JRadioButton radiobutton3 = new JRadioButton("RadioButton3");
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(radiobutton1);
        buttongroup.add(radiobutton2);
        buttongroup.add(radiobutton3);

        frame.add(radiobutton1);
        frame.add(radiobutton2);
        frame.add(radiobutton3);


        frame.setLayout(new GridLayout(2,3,2,2));
    }
}
