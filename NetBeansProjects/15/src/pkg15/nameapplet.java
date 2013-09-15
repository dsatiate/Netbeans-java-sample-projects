/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author admin
 */
public class nameapplet extends JApplet implements ActionListener {
    JTextField jtxt;
    JButton jbtn;
    //JLabel jlab;
    @Override
    public void init() {
        try {
                SwingUtilities.invokeAndWait(
                new Runnable() {
                    @Override
                    public void run() {
                       makeGUI();
                    }
                }
                );
            } catch (Exception exc) {
                System.out.println("Can't create because of " + exc);
            }
    }

    private void makeGUI() {
        setLayout(new FlowLayout());
        jtxt=new JTextField(15);
        //jlab=new JLabel("name entered.");
        jbtn=new JButton("Go");
        add(jtxt);
        add(jbtn);
        //add(jlab);
        jbtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String b=e.getActionCommand();
                if(b.equals("Go")){
			String ss=jtxt.getText();
			//jlab.setText(ss);
                        showStatus(ss);
			
    }
    }
}
