/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobutton;
import java.awt.*;
import javax.swing.*;
public class gui {
    JButton jbtn;
gui() {
// Create a new JFrame container.
final JFrame jfrm = new JFrame("Radio Demo");
// Specify FlowLayout for the layout manager.
jfrm.setLayout(new FlowLayout());
// Give the frame an initial size.
jfrm.setSize(250, 300);
// Terminate the program when the user closes the application.
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Make two buttons.

jbtn = new JButton("Botton");
myActionListener a=new myActionListener(jbtn);
JRadioButton b1 = new JRadioButton("Small");
b1.addActionListener(a);
JRadioButton b2 = new JRadioButton("Medium");
b2.addActionListener(a);
JRadioButton b3 = new JRadioButton("Big");
b3.addActionListener(a);
jfrm.add(b1);
jfrm.add(b2);
jfrm.add(b3);
jfrm.add(jbtn);

// Define a button group.
ButtonGroup bg = new ButtonGroup();
bg.add(b1);
bg.add(b2);
bg.add(b3);



// Display the frame.

    jfrm.setVisible(true);
}
}
