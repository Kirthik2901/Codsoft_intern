package com.codsoft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        ATM atm = new ATM(account);

        atm.run();
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: Rs." + account.getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposit successful. New balance: Rs." + account.getBalance());
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs." + account.getBalance());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            if (option == 1) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                withdraw(amount);
            } else if (option == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                deposit(amount);
            } else if (option == 3) {
                checkBalance();
            } else if (option == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
