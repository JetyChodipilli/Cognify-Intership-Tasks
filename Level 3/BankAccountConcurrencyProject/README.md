Bank Account Concurrency Project
Description
This Java program demonstrates multi-threading and concurrency concepts using a bank account simulation. Multiple threads perform random deposits and withdrawals on a shared BankAccount object, using a ReentrantLock to ensure thread-safe access to the shared resource (account balance). Each thread executes 5 transactions, and the program displays the initial and final balance, highlighting synchronization to prevent race conditions.
Prerequisites

Project Structure
BankAccountConcurrencyProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── BankAccount.java
│   │   │   ├── TransactionThread.java
│   │   │   └── Main.java
│   ├── test/
│   │   └── (Test files, not implemented)
├── target/
├── pom.xml
├── README.md
└── .gitignore

How to Set Up and Run

Ensure JDK 17+ and Maven are installed.
Place BankAccount.java, TransactionThread.java, and Main.java in src/main/java/.
Place pom.xml, README.md, and .gitignore in the project root.
Build the project:mvn clean install


Run the application:mvn exec:java


(Optional) Create and run an executable JAR:mvn package
java -jar target/BankAccountConcurrency-1.0-SNAPSHOT.jar



Example Output
Starting bank account balance: $1000.00
Deposited $45.23 by Thread-1. New balance: $1045.23
Withdrew $32.67 by Thread-2. New balance: $1012.56
Failed withdrawal of $78.91 by Thread-3 (Insufficient funds or invalid amount). Balance: $1012.56
Deposited $19.45 by Thread-1. New balance: $1032.01
[...]
Final bank account balance: $987.34

Concurrency Concepts Demonstrated

Threads: Multiple TransactionThread instances run concurrently, simulating simultaneous transactions.
Synchronization: ReentrantLock ensures thread-safe access to the BankAccount balance, preventing race conditions.
Locks: The ReentrantLock is used in deposit, withdraw, and getBalance methods to protect shared resources.
Thread Coordination: The join method ensures all threads complete before displaying the final balance.
Randomized Behavior: Threads perform random deposits or withdrawals with random amounts and delays to simulate real-world concurrency.
