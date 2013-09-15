/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skt;
import java.net.*;
/**
 *
 * @author admin
 */
public class Skt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        Address = InetAddress.getByName("osborne.com");
        System.out.println(Address);
        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i=0; i<SW.length; i++)
        System.out.println(SW[i]);
        }
    }

