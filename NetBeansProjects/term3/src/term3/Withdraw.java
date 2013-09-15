/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package term3;

/**
 *
 * @author admin
 */
class Withdraw implements Runnable {
account q;
Withdraw(account q) {
this.q = q;
new Thread(this, "Withdraw").start();
}
    @Override
public void run() {
int i=0;
while(i<5) {
            int withdraw = q.withdraw(400);
            i++;
}
}
}