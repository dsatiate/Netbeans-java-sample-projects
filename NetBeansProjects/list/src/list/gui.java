/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author admin
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class gui {

JList jlst;
JLabel jlab;
JScrollPane jscrlp;
// Create an array of cities.
String Days[] = { "Monday", "Tuesday", "Wednesday",
                "Thrusday", "Friday", "Saturday",
                "Sunday"};
    
gui() {
// Create a new JFrame container.
final JFrame jfrm = new JFrame("List Demo");
// Specify FlowLayout for the layout manager.
jfrm.setLayout(new FlowLayout());
// Give the frame an initial size.
jfrm.setSize(200, 200);
// Terminate the program when the user closes the application.
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Make two buttons.
// Create a JList.
jlst = new JList(Days);
// Set the list selection mode to single selection.
jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
// Add the list to a scroll pane.
jscrlp = new JScrollPane(jlst);
// Set the preferred size of the scroll pane.
jscrlp.setPreferredSize(new Dimension(120, 90));
// Make a label that displays the selection.
jlab = new JLabel("Choose a Day");
// Add selection listener for the list.
jlst.addListSelectionListener(new ListSelectionListener() {
            @Override
public void valueChanged(ListSelectionEvent le) {
// Get the index of the changed item.
int idx = jlst.getSelectedIndex();
// Display selection, if item was selected.
if(idx != -1)
jlab.setText("Current selection: " + Days[idx]);
else // Otherwise, reprompt.
jlab.setText("Choose a Day");
}
});
// Add the list and label to the content pane.
jfrm.add(jlab);
jfrm.add(jscrlp);

jfrm.setVisible(true);
}
}