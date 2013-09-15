/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class gui extends JFrame implements ActionListener{
    MenuBar mb;
    Menu m;
    MenuItem mi;
    Container c;
    
    public gui(){
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        mb=new MenuBar();
        m=new Menu("Color");
        mi=new MenuItem("Red");
        m.add(mi);
        mi=new MenuItem("Green");
        m.add(mi);
        mi=new MenuItem("Blue");
        m.add(mi);
        m.addActionListener(this);
        mb.add(m);
        setMenuBar(mb);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String bs=e.getActionCommand();
        if(bs.equals("Red"))
            c.setBackground(Color.RED);
        if(bs.equals("Green"))
            c.setBackground(Color.GREEN);
        if(bs.equals("Blue"))
            c.setBackground(Color.BLUE);
    }
    
}
