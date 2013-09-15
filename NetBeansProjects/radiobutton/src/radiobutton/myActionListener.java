/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/**
 *
 * @author admin
 */
public class myActionListener implements ActionListener {
    JButton b;
    
public myActionListener(JButton b){
    this.b=b;
}
    @Override
    public void actionPerformed(ActionEvent e) {

        //JRadioButton b1=(JRadioButton)e.getSource();
	//	String bval=b1.getText();
        String bval=e.getActionCommand();
        if(bval.equals("Small")){
            System.out.println("small");
			b.setSize(50,50);
		}
	if(bval.equals("Medium")){
            System.out.println("medium");
			b.setSize(75,75);
		}
	if(bval.equals("Big")){
            System.out.println("big");
			b.setSize(100,100);
		}
    }
    
}
