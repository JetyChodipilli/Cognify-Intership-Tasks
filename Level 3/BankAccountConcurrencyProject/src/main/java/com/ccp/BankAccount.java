package com.ccp;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final ReentrantLock lock;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            if (amount > 0) {
                balance += amount;
                System.out.printf("Deposited $%.2f by %s. New balance: $%.2f%n",
                        amount, Thread.currentThread().getName(), balance);
            } else {
                System.out.printf("Invalid deposit amount $%.2f by %s%n",
                        amount, Thread.currentThread().getName());
            }
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.printf("Withdrew $%.2f by %s. New balance: $%.2f%n",
                        amount, Thread.currentThread().getName(), balance);
            } else {
                System.out.printf("Failed withdrawal of $%.2f by %s (Insufficient funds or invalid amount). Balance: $%.2f%n",
                        amount, Thread.currentThread().getName(), balance);
            }
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}