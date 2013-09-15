/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package term3;

/**
 *
 * @author admin
 */
// A correct implementation of a producer and consumer.
class account {
int balance;
boolean valueSet = true;
synchronized int withdraw(int amount) {
while(valueSet)
{ valueSet=false;
    try {
        wait();
    } catch(InterruptedException e) {
        System.out.println("InterruptedException caught");
    }
}
if(balance>amount){
    balance=balance-amount;
    System.out.println("Withdraw successfu : " + balance);
}
else
    System.out.println("Balance not enough: " + balance);
    

valueSet = true;
notify();
return balance;
}


synchronized void deposite(int amount) {
while(valueSet)
{ valueSet=false;
    try {
wait();
} catch(InterruptedException e) {
System.out.println("InterruptedException caught");
}
}
balance = balance+amount;
valueSet = true;
System.out.println("deposited: " + balance);
notify();
}
}