/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author admin
 */
public class myexception extends Exception{
    int detail;
    public myexception(int i){
        detail=i;
    }
    
    @Override
    public String toString(){
        return "MyException "+ detail; 
    }

    
}
