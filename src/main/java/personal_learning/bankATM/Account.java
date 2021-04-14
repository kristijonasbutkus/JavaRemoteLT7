package personal_learning.bankATM;

import java.util.Scanner;

public class Account {

    private final String customerName;
    private final String customerID;
    private double balance;
    private int previousTransaction = 0;

    public Account (String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public void menu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("Please, choose an option: ");
            char optionInput = scanner.next().charAt(0);
            option = Character.toUpperCase(optionInput);

            switch (option) {
                case 'A':
                    System.out.println("---------------------------");
                    System.out.println("Your balance is: " + balance);
                    System.out.println("---------------------------");
                    break;

                case 'B':
                    System.out.println("Enter the amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    deposit(deposit);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("Enter the amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    withdrawal(withdraw);
                    System.out.println();
                    break;

                case 'D':
                    getPreviousTransaction();
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("Interaction with ATM machine is finished.");
                    break;
            }

        } while(option != 'E');

    }

    public void deposit(double amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = 1;
        }
    }

    public void withdrawal(double amount) {
        if (balance > amount) {
            balance = balance - amount;
            previousTransaction = -1;
        }
        else {
            System.out.println("You do not have that much money in your account! " +
                    "Please check your balance to see the remainder.");
        }
    }

    public void getPreviousTransaction() {
        if (previousTransaction == 1) {
            System.out.println("Last transaction was a deposit.");
        }
        else if (previousTransaction == -1) {
            System.out.println("Last transaction was a withdrawal.");
        }
        else System.out.println("There was no previous transaction.");
    }
}
