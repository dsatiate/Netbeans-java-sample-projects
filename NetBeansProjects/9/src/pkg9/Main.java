/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9;

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
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]={111,222,333,444,555,666,777,888,999};
        int c[]={11,22,33,44,55,66,77,88,99};
        obj q=new obj();
        new newthread(q, a, 1);
        new newthread(q, b, 2);
        new newthread(q, c, 3);
    }
}
