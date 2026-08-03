class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Withdrawal amount exceeds available balance."
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance = " + balance);
    }
}

class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}