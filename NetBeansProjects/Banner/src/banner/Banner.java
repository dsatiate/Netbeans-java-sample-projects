/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

// A parameterized banner
import java.awt.*;

import java.applet.*;
/*
<applet code="ParamBanner" width=300 height=50>
<param name=message value="Java makes the Web move!">
</applet>
*/
public class Banner extends Applet implements Runnable {
String msg;
Thread t = null;
int state;
boolean stopFlag;
// Set colors and initialize thread.
    @Override
public void init() {
setBackground(Color.cyan);
setForeground(Color.red);
}
// Start thread
    @Override
public void start() {
msg = getParameter("message");
if(msg == null) msg = "Message not found.";
msg = " " + msg;
t = new Thread(this);
stopFlag = false;
t.start();
}
// Entry point for the thread that runs the banner.
    @Override
public void run() {
char ch;
// Display banner
for( ; ; ) {
try {
repaint();
Thread.sleep(250);
ch = msg.charAt(0);
msg = msg.substring(1, msg.length());
msg += ch;
if(stopFlag)
break;
} catch(InterruptedException e) {}
}
}
// Pause the banner.
    @Override
public void stop() {
stopFlag = true;
t = null;
}
// Display the banner.
    @Override
public void paint(Graphics g) {
g.drawString(msg, 50, 30);
}
}