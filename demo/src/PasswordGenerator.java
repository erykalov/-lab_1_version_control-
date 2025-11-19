import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?";

    private static final String ALL = UPPER + LOWER + DIGITS + SYMBOLS;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            SecureRandom random = new SecureRandom();

            System.out.print("Enter passwor length: ");
            int length = scanner.nextInt();

            StringBuilder password = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(ALL.length());
                password.append(ALL.charAt(index));
            }

            System.out.println("Your password: " + password);
        }
    }
}
