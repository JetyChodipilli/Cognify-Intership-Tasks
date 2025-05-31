File Encryption/Decryption Project
Description
This Java program encrypts or decrypts the contents of a text file using a simple Caesar cipher with a fixed shift of 3. The user specifies directories for storing encrypted and decrypted files, provides an input file name or path, and an output file name. The program creates the specified directories if they don't exist, saves encrypted files to the user-defined encrypted directory, and decrypted files to the user-defined decrypted directory. Only letters (A-Z, a-z) are processed; non-letter characters remain unchanged.
Prerequisites



Project Structure
FileEncryptionDecryptionProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── FileEncryptorDecryptor.java
│   ├── test/
│   │   └── (Test files, not implemented)
├── encrypted/
│   └── (Encrypted files, user-specified path)
├── decrypted/
│   └── (Decrypted files, user-specified path)
├── target/
├── pom.xml
├── README.md
└── .gitignore

How to Set Up and Run

Ensure JDK 17+ and Maven are installed.
Place FileEncryptorDecryptor.java in src/main/java/.
Place pom.xml, README.md, and .gitignore in the project root.
Build the project:mvn clean install


Run the application:mvn exec:java


(Optional) Create and run an executable JAR:mvn package
java -jar target/FileEncryptionDecryption-1.0-SNAPSHOT.jar



Example Usage

Create a text file (e.g., input.txt) with content:Hello, World!
This is a test.


Run the program to encrypt:File Encryption/Decryption Program
Enter the directory path to store encrypted files (e.g., C:/Users/YourUsername/Documents/EncryptedFiles/):
C:/Users/YourUsername/Documents/EncryptedFiles/
Created directory: C:/Users/YourUsername/Documents/EncryptedFiles/
Enter the directory path to store decrypted files (e.g., C:/Users/YourUsername/Documents/DecryptedFiles/):
C:/Users/YourUsername/Documents/DecryptedFiles/
Created directory: C:/Users/YourUsername/Documents/DecryptedFiles/
Choose an option (1 or 2):
1. Encrypt a file
2. Decrypt a file
1
Enter the input file name or path:
input.txt
Enter the output file name (without path):
output.txt
File encrypted successfully. Saved to C:/Users/YourUsername/Documents/EncryptedFiles/output.txt


The C:/Users/YourUsername/Documents/EncryptedFiles/output.txt file contains:Khoor, Zruog!
Wklv lv d whvw.


Run the program to decrypt:File Encryption/Decryption Program
Enter the directory path to store encrypted files (e.g., C:/Users/YourUsername/Documents/EncryptedFiles/):
C:/Users/YourUsername/Documents/EncryptedFiles/
Enter the directory path to store decrypted files (e.g., C:/Users/YourUsername/Documents/DecryptedFiles/):
C:/Users/YourUsername/Documents/DecryptedFiles/
Choose an option (1 or 2):
1. Encrypt a file
2. Decrypt a file
2
Enter the input file name or path:
C:/Users/YourUsername/Documents/EncryptedFiles/output.txt
Enter the output file name (without path):
result.txt
File decrypted successfully. Saved to C:/Users/YourUsername/Documents/DecryptedFiles/result.txt


The C:/Users/YourUsername/Documents/DecryptedFiles/result.txt file contains:Hello, World!
This is a test.



Skills Demonstrated

File handling with BufferedReader and BufferedWriter for reading/writing text files
Directory creation using File.mkdirs()
String manipulation using a Caesar cipher for encryption/decryption
Input/output operations with Scanner for user interaction
Error handling for file operations using try-catch
Modular programming with separate methods
Maven for build automation

Notes

The program uses a Caesar cipher with a fixed shift of 3 (e.g., 'A' becomes 'D', 'B' becomes 'E').
Only letters (A-Z, a-z) are encrypted/decrypted; other characters remain unchanged.
Users must provide valid directory paths (e.g., C:/Users/YourUsername/Documents/EncryptedFiles/ on Windows, or /home/username/EncryptedFiles/ on Linux/Mac).
Ensure the input file exists and is readable, and the program has permission to create/write to the specified directories.
The program handles IO exceptions and reports errors (e.g., file not found).

