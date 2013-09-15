/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author admin
 */
public class AppletFrame extends JApplet implements MouseMotionListener {
    JPanel[] p=new JPanel[4];

    @Override
    public void init() {
       /* try {
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
            }*/
        makeGUI();
    }
    private void makeGUI() {

        setLayout(new GridLayout(2, 2));
        for(int i=0;i<4;i++) 
            p[i]=new JPanel();

        for(int i=0;i<4;i++) 
            add(p[i]);
    
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        int w=this.getWidth();
        int h=this.getHeight();
        
        int current=0;
		if(x<w/2 && y<h/2){
			p[0].setBackground(Color.BLUE);
			current=0;
		}
		else if(x>w/2 && y<h/2){
			p[1].setBackground(Color.RED);
			current=1;
		}
		else if(x<w/2 && y>h/2){
			p[2].setBackground(Color.GREEN);
			current=2;
		}
		else if(x>w/2 && y>h/2){
			p[3].setBackground(Color.YELLOW);
			current=3;
		}
		for(int i=0;i<4;i++){
			if(i!=current){
				p[i].setBackground(Color.WHITE);
			}
		}
    }
}
