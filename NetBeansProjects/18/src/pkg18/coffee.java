/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;

/**
 *
 * @author admin
 */
public class coffee {
    int temprature;
    public void setTemp(int temp){
        temprature=temp;
    }
    public int checkTemp() throws TooColdException , TooHotException, Exception{
        if(temprature<65)
            throw new TooColdException();
        if(temprature>85)
            throw new TooHotException();
        if(temprature>=65&&temprature<=85)
            throw new Exception();
        return temprature;
    }
    
}
