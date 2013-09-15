/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class gui extends JFrame implements ActionListener{
    JButton jbtr;
    JButton jbtg;
    JButton jbtb;
    Container c;

    public gui(){
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        jbtr=new JButton("Red");
        jbtr.addActionListener(this);
        c.add(jbtr);
        jbtg=new JButton("Green");
        jbtg.addActionListener(this);
        c.add(jbtg);
        jbtb=new JButton("Blue");
        jbtb.addActionListener(this);
        c.add(jbtb);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String bs=e.getActionCommand();

        if(bs.equals("Red")){
            c.setBackground(new Color(255, 0, 0));}
        else if(bs.equals("Green")){
            c.setBackground(new Color(0, 255, 0));}
        else if(bs.equals("Blue")){    
            c.setBackground(new Color(0, 0, 255));
            }      
            
        }
}