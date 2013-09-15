/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;


public class list1 extends JFrame{
	private JLabel label;
	private List li;
	
	public list1(String title){
		super(title);
		Container con=this.getContentPane();
		label=new JLabel("Double Click A Day");
		
		JPanel p1=new JPanel();
		p1.add(label);
		con.add(p1,BorderLayout.NORTH);
		
		li=new List();
		li.add("Sunday");
		li.add("Monday");
		li.add("Tuesday");
		li.add("Wednesday");
		li.add("Thursday");
		li.add("Friday");
		li.add("Saturday");
		
		
		JPanel p2=new JPanel();
		p2.add(li);
		con.add(p2,BorderLayout.CENTER);
		ListDisp l=new ListDisp(label);
		li.addActionListener(l);
		
	}
	public static void main(String[] args){
		JFrame f=new list1("List Demo");
		f.setBackground(Color.CYAN);
		f.setBounds(200,100,300,300);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

}
