/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;
import java.net.*;

/**
 *
 * @author admin
 */
public class Socket {
    public static int serverPort = 1998;
public static int clientPort = 1999;
public static int buffer_size = 1024;
public static DatagramSocket ds;
public static byte buffer[] = new byte[buffer_size];

public static void TheServer() throws Exception {
int pos=0;
while (true) {
int c = System.in.read();
switch (c) {
case -1:
System.out.println("Server Quits.");
return;
case '\r':
break;
case '\n':
ds.send(new DatagramPacket(buffer,pos,
InetAddress.getLocalHost(),clientPort));
pos=0;
break;
default:
buffer[pos++] = (byte) c;
}
}
}
   public static void TheClient() throws Exception {
while(true) {
DatagramPacket p = new DatagramPacket(buffer, buffer.length);
ds.receive(p);
System.out.println(new String(p.getData(), 0, p.getLength()));
}
}
public static void main(String args[]) throws Exception {
if(args.length == 1) {
ds = new DatagramSocket(serverPort);
TheServer();
} else {
ds = new DatagramSocket(clientPort);
TheClient();
}
}
}
