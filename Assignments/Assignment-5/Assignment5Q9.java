interface Account {
    void displayBalance();
    void withdraw(double amt);
    void displayAccountDetails();
}

class SavingsAccount implements Account {
    String acNo;
    double bal;
    double ir;

    SavingsAccount(String a, double b, double i) {
        acNo = a;
        bal = b;
        ir = i;
    }

    public void displayBalance() {
        System.out.println("Balance: " + bal);
    }

    public void withdraw(double amt) {
        if (bal >= amt) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Savings A/C: " + acNo);
        System.out.println("Interest Rate: " + ir);
        displayBalance();
    }
}

class CurrentAccount implements Account {
    String acNo;
    double bal;
    double od;

    CurrentAccount(String a, double b, double o) {
        acNo = a;
        bal = b;
        od = o;
    }

    public void displayBalance() {
        System.out.println("Balance: " + bal);
    }

    public void withdraw(double amt) {
        if ((bal + od) >= amt) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Current A/C: " + acNo);
        System.out.println("Overdraft Limit: " + od);
        displayBalance();
    }
}

public class Assignment5Q9 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 4.5);
        sa.displayAccountDetails();
        sa.withdraw(2000);
        sa.displayBalance();

        System.out.println();

        CurrentAccount ca = new CurrentAccount("CA456", 10000, 2000);
        ca.displayAccountDetails();
        ca.withdraw(11000);
        ca.displayBalance();
    }
}