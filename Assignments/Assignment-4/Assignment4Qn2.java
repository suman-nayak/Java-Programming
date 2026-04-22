import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    int acNum;
    double acBalance;

    BankAccount(String accountHolderName, int acNum, double acBalance){
        this.accountHolderName = accountHolderName;
        this.acNum = acNum;
        this.acBalance = acBalance;
    }

    void deposit(double amount){
        acBalance = acBalance + amount;
    }

    void withdraw(double amount){
        if(amount <= acBalance){
            acBalance = acBalance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + acNum);
        System.out.println("Account Balance: " + acBalance);
    }
}

public class Assignment4Qn2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Account Number:");
        int num = sc.nextInt();

        System.out.println("Enter Initial Balance:");
        double bal = sc.nextDouble();

        BankAccount b = new BankAccount(name, num, bal);

        System.out.println("Enter deposit amount:");
        double dep = sc.nextDouble();
        b.deposit(dep);

        System.out.println("Enter withdraw amount:");
        double wit = sc.nextDouble();
        b.withdraw(wit);

        b.display();
    }
}