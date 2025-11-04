package MyPackage.Array.BankChallenge;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void depositeMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid deposite");
        } else {
            balance += money;
        }
    }

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public double withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("Please, Enter your amount");
        } else if (money > balance){
            System.out.println("No Sufficient balance");
        }
        return balance -= money;
    }

}
