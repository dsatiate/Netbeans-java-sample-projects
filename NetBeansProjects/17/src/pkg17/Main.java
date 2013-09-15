/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17;

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
        StrRevers obj=new StrRevers();
        //String s=args[0];
        try{
            System.out.println(obj.strrev(args));
        }catch(MyException e){
            System.out.println("MyException Caught.");
        }
                
    }
}
