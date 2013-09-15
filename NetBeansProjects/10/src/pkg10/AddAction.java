/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

/**
 *
 * @author admin
 */
class AddAction implements ActionListener{
	private JTextArea jt;
	String s1;
	private JFrame f2;
	public AddAction(JTextArea c,JFrame con1){
		jt=c;
		f2=con1;
	    	
	}
    @Override
	public void actionPerformed (ActionEvent e){
		String b=e.getActionCommand();
	
		if(b.equals("Send")){
			String ss=jt.getText();
			System.out.println(ss);
			f2.setBackground(Color.blue);
			
		}
		else if(b.equals("Cancel")){
			f2.setVisible(false);
		}
	}
}