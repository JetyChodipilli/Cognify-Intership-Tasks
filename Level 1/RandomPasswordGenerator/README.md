Random Password Generator Project
Description
This Java program generates a random password based on user specifications. It prompts the user to enter the desired password length and whether to include lowercase letters, uppercase letters, numbers, and special characters. The program validates inputs to ensure the length is positive and at least one character type is selected, then generates and displays a random password.
How to Run

Ensure you have Java installed (JDK 8 or later).
Place RandomPasswordGenerator.java in the src directory.
Compile the program:javac src/RandomPasswordGenerator.java -d bin


Run the program:java -cp bin RandomPasswordGenerator



Example Usage
Random Password Generator
Enter the desired password length:
12
Include lowercase letters? (y/n):
y
Include uppercase letters? (y/n):
y
Include numbers? (y/n):
y
Include special characters? (y/n):
y
Generated Password: kJ9#mP$2nL!x

Random Password Generator
Enter the desired password length:
8
Include lowercase letters? (y/n):
y
Include uppercase letters? (y/n):
n
Include numbers? (y/n):
n
Include special characters? (y/n):
n
Generated Password: stuvwxyz

Random Password Generator
Enter the desired password length:
5
Include lowercase letters? (y/n):
n
Include uppercase letters? (y/n):
n
Include numbers? (y/n):
n
Include special characters? (y/n):
n
Error: At least one character type must be selected.

Skills Demonstrated

Random number generation using Random class
String manipulation with StringBuilder
User input handling and validation using Scanner
Conditional statements for input processing
Modular programming with a separate password generation method

S