import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class un14CheckboxRadiobutton extends JFrame
{
     JCheckBox checkbox1, checkbox2, checkbox3;
    public JRadioButton radiobutton1, radiobutton2;
    public ButtonGroup group; //optional not compulsory
    public un14CheckboxRadiobutton()
    {
        Container c = getContentPane();
        c.setLayout(new GridLayout(2,3,2,3));
        //checkboxes
        checkbox1 = new JCheckBox("checkbox1");
        checkbox2 = new JCheckBox("checkbox2");
        checkbox3 = new JCheckBox("checkbox3");
        c.add(checkbox1);
        c.add(checkbox2);
        c.add(checkbox3);

        //radio button
        radiobutton1 = new JRadioButton("option1");
        radiobutton2 = new JRadioButton("option2");


       group = new ButtonGroup();   //optional not compulsory
       group.add(radiobutton1);     //optional not compulsory
       group.add(radiobutton2);     //optional not compulsory

        c.add(radiobutton1);
        c.add(radiobutton2);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Checkbox and radiobutton example");
    }
    public static void main(String[]args)
    {

        new un14CheckboxRadiobutton();
    }
}

