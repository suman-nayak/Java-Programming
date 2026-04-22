public class ACCOUNT {
    int accountNo;
    String customerName;
    double accountBalance;

    // Static variables
    static int totalAccounts = 0;
    static double totalBankBalance = 0;

    // Parameterized Constructor
    ACCOUNT(int accountNo, String customerName, double accountBalance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.accountBalance = accountBalance;

        totalAccounts++;
        totalBankBalance += accountBalance;
    }

    // Deposit method
    void deposit(double amount) {
        accountBalance += amount;
        totalBankBalance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            totalBankBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display account information
    void displayAccountInfo() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + accountBalance);
        System.out.println();
    }

    // Display bank details
    static void displayBankDetails() {
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }

    public static void main(String[] args) {

        ACCOUNT a1 = new ACCOUNT(101, "Suman", 5000);
        ACCOUNT a2 = new ACCOUNT(102, "Rahul", 7000);

        a1.deposit(1000);
        a2.withdraw(2000);

        a1.displayAccountInfo();
        a2.displayAccountInfo();

        ACCOUNT.displayBankDetails();
    }
}