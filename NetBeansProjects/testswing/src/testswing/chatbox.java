/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class chatbox {
    JLabel jlab;
chatbox() {
// Create a new JFrame container.
final JFrame jfrm = new JFrame("Chat Demo");
// Specify FlowLayout for the layout manager.
jfrm.setLayout(new FlowLayout());
// Give the frame an initial size.
jfrm.setSize(250, 300);
// Terminate the program when the user closes the application.
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Make two buttons.
JButton jbtnSend = new JButton("Send");
JButton jbtnCancel = new JButton("Cancel");

final JTextArea jt=new JTextArea(10,20);
// Add action listener for Alpha.
jbtnSend.addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent ae) {
//jlab.setText("Alpha was pressed.");
                String b=ae.getActionCommand();
                if(b.equals("Send")){
			String ss=jt.getText();
			System.out.println(ss);
			//jt.setBackground(Color.yellow);
			
		}
		
}
});
// Add action listener for Beta.
jbtnCancel.addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent ae) {
//jlab.setText("Beta was pressed.");
                String b=ae.getActionCommand();
                if(b.equals("Cancel")){
			jfrm.setVisible(false);
		}
}
});
// Create a text-based label.
jlab = new JLabel("Enter Text.");
// Add the label to the content pane.
jfrm.add(jlab);

jfrm.add(jt);
// Add the buttons to the content pane.
jfrm.add(jbtnSend);
jfrm.add(jbtnCancel);


// Display the frame.

    jfrm.setVisible(true);
}
}