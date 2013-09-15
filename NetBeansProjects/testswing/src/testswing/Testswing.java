/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testswing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Testswing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
        public void run() {
        new chatbox();
}
});
}
    }

