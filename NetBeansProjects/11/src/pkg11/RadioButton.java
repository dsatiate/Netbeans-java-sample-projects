/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

/**
 *
 * @author admin
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.awt.*;
public class RadioButton extends JFrame implements ItemListener {
	

	private JRadioButton r1,r2,r3;
	private JButton b;
	private  ButtonGroup bg;
	
	private RadioButton(String title){
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=this.getContentPane();
		bg=new ButtonGroup();
		
		r1=new JRadioButton("small");
		r2=new JRadioButton("Medium");
		r3=new JRadioButton("Large");
		
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		b=new JButton("Click Me");
		
		JPanel center=new JPanel();
		center.setLayout(null);
		center.add(b);
		
		contentPane.add(center,BorderLayout.CENTER);
		
		JPanel north=new JPanel();
		north.add(r1);
		north.add(r2);
		north.add(r3);
		
		contentPane.add(north,BorderLayout.NORTH);
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
		
	}
	
		
	

    @Override
	public void itemStateChanged(ItemEvent e) {
		Object ss=e.getItem();
		
		if(ss.equals(r1)){
			
		b.setBounds(100,50,100,50);
		
	}
		else if(ss.equals(r2)){
			b.setBounds(100,50,200,100);
			
			}
		else if(ss.equals(r3)){
			b.setBounds(100,50,300,200);
			
			
		}

}
	
	public static void main(String[] args) {
		JFrame f=new RadioButton("RadioButton Demo");
		f.setBounds(200,200,300,350);
		f.setVisible(true);
		

	}
	}
