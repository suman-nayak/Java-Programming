import java.util.Scanner;
public class Inter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Balance:");
        double bal = sc.nextDouble();
        int ch;

        while (true) {
            System.out.println("\n-=-=-=MENU=-=-=-\n");
            System.out.println("1.Display Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.exit");

            System.out.println("Enter your Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:System.out.println("the balance is:" + bal);
                    break;
                case 2:System.out.println("Enter the deposite amount:");
                double deposie = sc.nextDouble();
                if (deposie > 0) {
                    bal =+ deposie;                    
                }
                else{
                    System.out.println("Enter the +ve amount");
                }
                break;
                case 3:System.out.println("How many amount You want to Withdraw:");
                double withdraw = sc.nextDouble();

                if (withdraw > bal) {
                    System.out.println("Ineffcient Balance here");
                }
                else if (withdraw <= 0) {
                    System.out.println("Invalid amount");                    
                } else {
                    bal =- withdraw;
                    System.out.println("Please collect your case.😊");
                }

                case 4:System.out.println("Thank you for Using Our ATM 😊.");
                sc.close();
                return;
            
                default:System.out.println("Please Enter a Valid Choice");
                    break;
            }
        }

    }
}