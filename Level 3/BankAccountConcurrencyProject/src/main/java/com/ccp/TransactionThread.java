package com.ccp;

import java.util.Random;

public class TransactionThread extends Thread {
    private final BankAccount account;
    private final Random random = new Random();

    public TransactionThread(String name, BankAccount account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Randomly choose deposit or withdrawal
            boolean isDeposit = random.nextBoolean();
            double amount = random.nextDouble() * 100; // Random amount between 0 and 100

            if (isDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }

            // Simulate some delay
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}