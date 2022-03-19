import entity.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder =  sc.nextLine();


        System.out.print("Is there na initial deposit (y/n)? ");
        String option = sc.nextLine();

        double balance = 0;
        if(option.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
        }

        Account account = new Account(number, holder, balance);

        System.out.println("\nAccount data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", account.getNumber(), account.getHolder(), account.getBalance());

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);

        System.out.println("\nUpdate account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", account.getNumber(), account.getHolder(), account.getBalance());

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("\nUpdate account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", account.getNumber(), account.getHolder(), account.getBalance());


    }
}
