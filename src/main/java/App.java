import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.next();
        System.out.println("Input String: " + message );
        System.out.println("Encrypted String: " + encryption.runEncryption(message, 3));
        System.out.println("Decrypted String: "+ decryption.runDecryption(message, 3));
        sc.close();
    }
}

