package encapsulation;

public class BankAccount {
    private int accountNumber;
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposite(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        return balance;
    }


    public int withdraw(int amount) {
        if(amount > balance || balance == 0) {
            System.out.println("Your transcation cant be processed");
        } else {
            System.out.println("Your transaction in process ....");
            balance = balance - amount;
        }
       return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setAccountNumber(12141512);
        acc.deposite(4000);
        acc.withdraw(9000);
        System.out.println("Your balance is: " + acc.getBalance());

    }
}
