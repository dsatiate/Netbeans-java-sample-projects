/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       int temp;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the Temprature Value to set temprature:");
       temp=Integer.parseInt(br.readLine());
       coffee c=new coffee();
       ServeCoffee sc=new ServeCoffee(c, temp);
       DrinkCoffee dc=new DrinkCoffee(c);
    }
}
