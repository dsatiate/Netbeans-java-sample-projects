/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

/**
 *
 * @author admin
 */
public class prog {
    public void match(String s1,String s2) throws myexception {
        if(s1.equals(s2))
            System.out.println("Strings are Same.");
        else 
            throw new myexception();
    }
    
}
