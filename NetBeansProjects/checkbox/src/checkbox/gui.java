/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class gui {
    
    gui() {
       
// Create a new JFrame container.
final JFrame jfrm = new JFrame("CheckBox Demo");
// Specify FlowLayout for the layout manager.
jfrm.setLayout(new FlowLayout());
// Give the frame an initial size.
jfrm.setSize(200, 200);
// Terminate the program when the user closes the application.
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=jfrm.getContentPane();

MyItemListener a=new MyItemListener(c);
// Add check boxes to the content pane.
JCheckBox cb = new JCheckBox("Red");
cb.addItemListener(a);
c.add(cb);
cb = new JCheckBox("Green");
cb.addItemListener(a);
jfrm.add(cb);
cb = new JCheckBox("Blue");
cb.addItemListener(a);
c.add(cb);
//Container c=this.getContentPane();
jfrm.setVisible(true);

    }
    
}
