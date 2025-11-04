package MyPackage.Array.BankChallenge;

public class Customer {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("0101cdfv0", "Arshad Ali");
        acc.depositeMoney(100);
        acc.depositeMoney(500);
        acc.withdrawMoney(0);
        acc.withdrawMoney(800);
    }
}
