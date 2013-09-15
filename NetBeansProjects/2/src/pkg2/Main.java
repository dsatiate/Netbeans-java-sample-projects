/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

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
        prog p=new prog();
        for(int i=0;i<5;i++){
            try{
                p.differentexception(i);
            }
            catch(NullPointerException e){
                System.out.println("NullpointerException: "+e);
                e.printStackTrace();
            }
            catch(NegativeArraySizeException e){
                System.out.println("NegativeArraySizeException: "+e);
                e.printStackTrace();
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException: "+e);
                e.printStackTrace();
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException: "+e);
                e.printStackTrace();
            }
            catch(myexception e){
                System.out.println("myexception: "+e);
                e.printStackTrace();
            }
            
        }
    }
}
