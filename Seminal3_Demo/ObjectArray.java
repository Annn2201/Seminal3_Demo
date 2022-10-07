import java.util.Scanner;

public class ObjectArray {
    public static void createAccounts(BankAccount[] array) {
        double balance;
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the balance of accounts " + (i+1) + ": ");
            balance = kb.nextDouble();
            array[i] = new BankAccount(balance);
        }
    }

    public static void main(String[] args) {
        final int NUM_ACCOUNTS;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number of accounts: ");
        NUM_ACCOUNTS = kb.nextInt();
        BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];

        createAccounts(accounts);

        System.out.println("Here are the balances for each acount: ");

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account " + (i + 1) + ": $" + accounts[i].getBalance());
        }

    }

}
