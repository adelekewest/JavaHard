import java.util.Scanner;

public class EnterPin {
    public static void main ( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int pin, entry;
        String password;

        pin = 12345;
        System.out.println("WELCOME TO THE BANK OF JAVA");
        System.out.print("Enter your password: ");
        password = keyboard.next();

        System.out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();

        while (!password.equals("adelekewest")) {
            System.out.println("\nEnter a correct password");
            System.out.println("Enter your password: ");
            password = keyboard.next();
        }

        while (entry != pin) {
            System.out.println("\nINCORRECT PIN TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
    } 
}