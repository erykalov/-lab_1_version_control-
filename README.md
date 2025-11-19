# Password Generator (Java)

A simple console-based password generator written in Java.
The user specifies the desired password length, and the program generates a secure random password containing letters, digits, and special characters.

## 🚀 Features

* Generate a password of any length
* Uses `SecureRandom` for strong randomness
* Characters include:

  * Uppercase letters (A–Z)
  * Lowercase letters (a–z)
  * Digits (0–9)
  * Special symbols (!@#$%^&*()-_=+<>?)

## 📦 How to Run

1. Make sure you have Java 8+ installed
2. Compile the program:

   ```
   javac PasswordGenerator.java
   ```
3. Run it:

   ```
   java PasswordGenerator
   ```

## 📄 Code

```java
import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?";

    private static final String ALL = UPPER + LOWER + DIGITS + SYMBOLS;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALL.length());
            password.append(ALL.charAt(index));
        }

        System.out.println("Generated password: " + password);
    }
}
```

## 🛠 Possible Improvements

* Add options (letters only, digits only, no symbols, etc.)
* Add strength analysis
* Generate multiple passwords at once
* Add a graphical interface (JavaFX)
