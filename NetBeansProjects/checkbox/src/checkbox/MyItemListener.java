/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;


/**
 *
 * @author admin
 */
public class MyItemListener implements ItemListener {
 
    Container c;
    boolean red,green,blue;

    public MyItemListener(Container c) {
        this.c=c;
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox src=(JCheckBox)e.getItem();
	String ss=src.getText();
	int state=e.getStateChange();
	if(ss.equals("Red")){
		red=(state==e.SELECTED)?true:false;
		}
	else if(ss.equals("Blue")){
		blue=(state==e.SELECTED)?true:false;
	}
	
	else if(ss.equals("Green")){
		green=(state==e.SELECTED)?true:false;
	}
	Color mixed=Color.BLACK;
	if(green && !red && !blue)
		 mixed =Color.green;
	
	else if(red && !blue && !green)
		 mixed=Color.red;
	
	else if(blue && !red && !green)
		 mixed=Color.blue;
	
	else if(red && blue && green)
		mixed=new Color(255,255,255);
	else if(red && green)
		 mixed=new Color(255,255,0);
	
	else if(red && blue)
		 mixed=new Color(255,0,255);
	
	else if(green && blue)
		 mixed=new Color(0,255,255);
	c.setBackground(mixed);
    }
    
}
