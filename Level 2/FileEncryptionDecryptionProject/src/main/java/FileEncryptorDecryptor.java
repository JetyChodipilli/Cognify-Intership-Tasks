import java.io.*;
import java.util.Scanner;

public class FileEncryptorDecryptor {
    private static final int SHIFT = 3; // Caesar cipher shift value

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File Encryption/Decryption Program");
        
        // Prompt for directories
        System.out.println("Enter the directory path to store encrypted files (e.g., C:/Users/YourUsername/Documents/EncryptedFiles/):");
        String encryptedDir = scanner.nextLine().trim();
        if (!encryptedDir.endsWith(File.separator)) {
            encryptedDir += File.separator;
        }
        
        System.out.println("Enter the directory path to store decrypted files (e.g., C:/Users/YourUsername/Documents/DecryptedFiles/):");
        String decryptedDir = scanner.nextLine().trim();
        if (!decryptedDir.endsWith(File.separator)) {
            decryptedDir += File.separator;
        }
        
        // Create directories if they don't exist
        createDirectory(encryptedDir);
        createDirectory(decryptedDir);
        
        System.out.println("Choose an option (1 or 2):");
        System.out.println("1. Encrypt a file");
        System.out.println("2. Decrypt a file");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.println("Enter the input file name or path:");
        String inputFile = scanner.nextLine();
        
        System.out.println("Enter the output file name (without path):");
        String outputFileName = scanner.nextLine();
        
        // Determine output file path based on operation
        String outputFile = (choice == 1 ? encryptedDir : decryptedDir) + outputFileName;
        
        try {
            if (choice == 1) {
                processFile(inputFile, outputFile, true);
                System.out.printf("File encrypted successfully. Saved to %s%n", outputFile);
            } else if (choice == 2) {
                processFile(inputFile, outputFile, false);
                System.out.printf("File decrypted successfully. Saved to %s%n", outputFile);
            } else {
                System.out.println("Invalid choice. Please select 1 or 2.");
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    private static void createDirectory(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Created directory: " + path);
            } else {
                System.out.println("Failed to create directory: " + path);
            }
        }
    }
    
    private static void processFile(String inputFile, String outputFile, boolean encrypt) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String processedLine = encrypt ? encrypt(line) : decrypt(line);
                writer.write(processedLine);
                writer.newLine();
            }
        }
    }
    
    private static String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) (base + (c - base + SHIFT) % 26));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    
    private static String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) (base + (c - base - SHIFT + 26) % 26));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}