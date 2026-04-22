/*You are building a simple ATM withdrawal system. Create an account class with
properties like name, balance and pin. Implement the following features:
a.The user can check the balance.
b.
c.
d.
The user can withdraw an amount. If the user tries to withdraw more than their
balance, throw a custom
withdrawal amount
is
InvalidAmountException.
exception InsufficientFundsException. If the
throw a
negative or
custom
zero,
Before making any transaction (balance check or withdraw) the pin has be
entered. If the user enters an invalid PIN, throw a custom exception
InvalidPinException.
If the user tries to withdraw more than the maximum allowed limit, throw a
custom exception WithdrawalLimitExceededException. */
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String m) {
        super(m);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String m) {
        super(m);
    }
}

class InvalidPinException extends Exception {
    InvalidPinException(String m) {
        super(m);
    }
}

class WithdrawalLimitExceededException extends Exception {
    WithdrawalLimitExceededException(String m) {
        super(m);
    }
}

class Account {
    String n;
    double b;
    int p;
    double l;

    Account(String nm, double bl, int pn, double lm) {
        n = nm;
        b = bl;
        p = pn;
        l = lm;
    }

    void cb(int ip) throws InvalidPinException {
        if (p != ip) {
            throw new InvalidPinException("Invalid PIN");
        }
        System.out.println("Balance: " + b);
    }

    void wd(int ip, double am) throws InvalidPinException, InvalidAmountException, WithdrawalLimitExceededException, InsufficientFundsException {
        if (p != ip) {
            throw new InvalidPinException("Invalid PIN");
        }
        if (am <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        }
        if (am > l) {
            throw new WithdrawalLimitExceededException("Limit Exceeded");
        }
        if (am > b) {
            throw new InsufficientFundsException("Insufficient Funds");
        }
        b -= am;
        System.out.println("Withdrawn: " + am + ", New Balance: " + b);
    }
}

public class Assignment6Q5 {
    public static void main(String[] args) {
        Account a = new Account("Sam", 5000, 1234, 2000);

        try {
            a.cb(1234);
            a.wd(1234, 1500);
            a.wd(1234, 2500);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}