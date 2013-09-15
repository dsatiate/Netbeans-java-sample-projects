/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author admin
 */
public class prog {
    public void differentexception(int i) throws 
            NullPointerException,NegativeArraySizeException, ArrayIndexOutOfBoundsException,ArithmeticException,myexception{
        
        int result = 0;                                                    // Somewhere to store a result.
        int arraySize = 3;
        int badSize = -1;                                                  // A negative size to generate NegativeArraySizeException.
        int[] array = null;                                                
        
        switch(i){
            case 0:result = array[0]; 
                break;
            case 1: array = new int[badSize];
                break;
            case 2:array = new int[arraySize];
                result = array[arraySize]; 
                break;
            case 3: result=1/0;
                break;
            default: throw new myexception(i);   
        }
        
    }
    
}
