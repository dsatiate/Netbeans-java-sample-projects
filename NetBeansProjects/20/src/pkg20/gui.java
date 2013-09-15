/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Random;

/**
 *
 * @author admin
 */
public class gui extends JFrame implements ActionListener{
    JButton jbtn;
    Container c;
    int r = 0;
    int g = 0;
    int b = 0;
    public gui(){
        setLayout(new FlowLayout());
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        jbtn=new JButton("Click");
        jbtn.addActionListener(this);
        c.add(jbtn);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String bs=e.getActionCommand();
        Random rg=new Random();
        r=rg.nextInt(255);
        g=rg.nextInt(255);
        b=rg.nextInt(255);
        if(bs.equals("Click")){
            c.setBackground(new Color(r, g, b));
            
        }
    }
    
}
