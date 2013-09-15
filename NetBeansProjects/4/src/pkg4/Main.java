/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

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
        String s1="I Love India";
        String s2=args[0];
        prog p=new prog();
        try{
            p.match(s1, s2);
        }
        catch(myexception e){
            System.out.println("String entered is not I love India.");
        }
    }
}
