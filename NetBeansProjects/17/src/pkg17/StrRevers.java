/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17;

/**
 *
 * @author admin
 */
public class StrRevers {
    public String strrev(String[] s)throws MyException {
        
        String revstr="";
        try{
            if(s[0]==null){
            }
        }catch(ArrayIndexOutOfBoundsException e){
            throw new MyException();
        }
        for(int i=s[0].length()-1;i>=0;--i)
            revstr += s[0].charAt(i);

        return revstr;
    } 
    
}
