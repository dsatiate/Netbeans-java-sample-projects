/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox;

/**
 *
 * @author admin
 */
import javax.swing.*;
public class Checkbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
        public void run() {
        new gui();
}
});
    }
}
