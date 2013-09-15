/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10;

/**
 *
 * @author admin
 */
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class ChatBox extends JFrame{
	
	private JTextArea ta;
	private JButton b1,b2;
	private JLabel l;

	public ChatBox(String title){
		super(title);
		Container con=this.getContentPane();
		l=new JLabel("Sending Message");
		ta=new JTextArea(10,20);
		
		b1=new JButton("Send");
		b2=new JButton("Cancel");
		
		JPanel p1=new JPanel();
		p1.add(l);
                con.add(ta,BorderLayout.CENTER);
		con.add(p1,BorderLayout.NORTH);
		
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		
		con.add(p2,BorderLayout.SOUTH);
		
		AddAction a=new AddAction(ta,this);
		b1.addActionListener(a);
		b2.addActionListener(a);
		
	}
	public static void main(String[] args) {
		JFrame f=new ChatBox("Demo");
		f.setSize(300,350);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		

	}

}