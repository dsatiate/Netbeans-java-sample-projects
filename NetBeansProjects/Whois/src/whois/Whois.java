/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whois;
import java.net.*;
import java.io.*;

/**
 *
 * @author admin
 */
public class Whois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
        int c;
// Create a socket connected to internic.net, port 43.
Socket s = new Socket("internic.net", 80);
// Obtain input and output streams.
InputStream in = s.getInputStream();
OutputStream out = s.getOutputStream();
// Construct a request string.

String str= ("GET /whois.html HTTP/1.0\r\n\r\n");
// Convert to bytes.
byte buf[] = str.getBytes();
// Send request.
out.write(buf);
// Read and display response.
while ((c = in.read()) != -1) {
System.out.print((char) c);
}
s.close();
        
    }
}
