/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jfrm = new JFrame("Exit on Close");
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        jfrm.setSize(300, 300);  
    }
}
