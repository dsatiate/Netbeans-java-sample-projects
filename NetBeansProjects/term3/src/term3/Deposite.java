/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package term3;

/**
 *
 * @author admin
 */
class Deposite implements Runnable {
account q;
Deposite(account q) {
this.q = q;
new Thread(this, "Deposite").start();
}
    @Override
public void run() {
int i = 0;
while(i<5) {
q.deposite(500);
i++;
}
}
}