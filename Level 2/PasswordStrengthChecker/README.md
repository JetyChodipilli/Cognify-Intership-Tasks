Password Strength Checker Project
Description
This Java program evaluates the strength of a user-provided password based on specific criteria: length, presence of uppercase letters, lowercase letters, numbers, and special characters. It assigns a strength level (Weak, Moderate, or Strong) and provides feedback to the user. The program uses a console-based interface for simplicity.
How to Run

Ensure you have Java installed (JDK 8 or later).
Place PasswordStrengthChecker.java in the src directory.
Compile the program:javac src/PasswordStrengthChecker.java -d bin


Run the program:java -cp bin PasswordStrengthChecker



Example Usage
Password Strength Checker
Enter a password to check its strength:
Pass123!
Password: Pass123!
Strength: Moderate (meets some criteria)

Password Strength Checker
Enter a password to check its strength:
Ab1@xyz9
Password: Ab1@xyz9
Strength: Strong (meets all criteria)

Password Strength Checker
Enter a password to check its strength:
pass
Password: pass
Strength: Weak (missing several criteria)

Strength Criteria

Length: +2 points for ≥8 characters, +1 point for ≥6 characters.
Uppercase Letters: +1 point if present.
Lowercase Letters: +1 point if present.
Numbers: +1 point if present.
Special Characters: +1 point if present.
Strength Levels:
Strong: Score ≥ 5 (meets all criteria).
Moderate: Score ≥ 3 (meets some criteria).
Weak: Score < 3 (missing several criteria).



Skills Demonstrated

String manipulation to analyze password characters
Conditional statements for scoring and strength determination
Input/output operations using Scanner
Modular programming with a separate strength-checking method

Notes

The program considers any non-alphanumeric character as a special character.
Strength is evaluated based on a scoring system to provide clear feedback.
The console interface is simple but effective for demonstrating password analysis.

