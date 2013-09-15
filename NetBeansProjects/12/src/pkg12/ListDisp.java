/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
class ListDisp implements ActionListener{
	private JLabel disp;
	public ListDisp(JLabel d){
		disp=d;
		
	}
	
    @Override
	public void actionPerformed(ActionEvent e){
		Object o=e.getSource();
		if(o instanceof List){
			List list=(List)o;
			String ss=list.getSelectedItem();
			disp.setText(ss);
			
            			
		}
	}
}