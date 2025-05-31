package com.ccp;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Initial balance of $1000
        System.out.println("Starting bank account balance: $" + account.getBalance());

        // Create and start multiple threads
        TransactionThread[] threads = new TransactionThread[3];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new TransactionThread("Thread-" + (i + 1), account);
            threads[i].start();
        }

        // Wait for all threads to complete
        for (TransactionThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Final bank account balance: $" + account.getBalance());
    }
}