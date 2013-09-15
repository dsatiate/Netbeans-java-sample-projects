/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author admin
 */
public class demo {
    public void demo(){
        avg s=new avg();
        for(int i=2;i>=0;i--){
            try{
                s.calavg(100, i);
            }
            catch(ArithmeticException e)
            {
                System.out.println("AE occured. at i="+ i);
                e.printStackTrace();
            }
        }
    }
}
