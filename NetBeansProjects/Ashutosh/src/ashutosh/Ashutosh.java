/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ashutosh;

/**
 *
 * @author admin
 */
public class Ashutosh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gui g=new gui();
        while(g.wait);
        
        System.out.println("path="+g.path);
        System.out.println("min support="+g.min_s);
        System.out.println("min confidence="+g.min_c);
        
    }
}
