/*Write a class called Account with the following properties and methods:
Properties: String name, int acc_no,double balance
Methods: void deposit(int amt)
void withdraw(int amt),
void transfer (Account accl, Account acc2, int amt)
Assume that an account needs to have a minimum balance of 500. If an attempt is
made to withdraw or transfer, which results in balance below 500, throw a user
defined exception called MinimumBalanceException. */
class MinimumBalanceException extends Exception {
    MinimumBalanceException(String m) {
        super(m);
    }
}

class Account {
    String nm;
    int an;
    double bl;

    Account(String n, int a, double b) {
        nm = n;
        an = a;
        bl = b;
    }

    void deposit(int am) {
        bl += am;
        System.out.println("Deposited. New balance: " + bl);
    }

    void withdraw(int am) throws MinimumBalanceException {
        if (bl - am < 500) {
            throw new MinimumBalanceException("Balance below 500");
        }
        bl -= am;
        System.out.println("Withdrawn. New balance: " + bl);
    }

    void transfer(Account a1, Account a2, int am) throws MinimumBalanceException {
        if (a1.bl - am < 500) {
            throw new MinimumBalanceException("Transfer failed. Balance below 500");
        }
        a1.bl -= am;
        a2.bl += am;
        System.out.println("Transferred. A1 balance: " + a1.bl + ", A2 balance: " + a2.bl);
    }
}

public class Assignment6Q4 {
    public static void main(String[] args) {
        Account x = new Account("John", 101, 2000);
        Account y = new Account("Doe", 102, 1000);

        x.deposit(500);

        try {
            x.withdraw(1000);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            x.transfer(x, y, 1200);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}