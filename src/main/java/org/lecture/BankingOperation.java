package org.lecture;

public class BankingOperation {


    static void main() {

        BankAccount account1 = new BankAccount("John", 1000);
        account1.deposit(100);
        account1.printBalance();
        account1.deposit(300);
        account1.printBalance();
        account1.withdraw(-1000);
        account1.printBalance();
        account1.withdraw(-100);
        account1.printBalance();
        account1.withdraw(-100);
        account1.printBalance();
        account1.withdraw(-100);
        account1.printBalance();
        account1.withdraw(-100);
        account1.printBalance();
        account1.withdraw(-1000);
        account1.printBalance();
    }


}
