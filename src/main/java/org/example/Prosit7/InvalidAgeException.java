// java
package org.example.Prosit7;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Âge d\\'animal invalide : l\\'âge ne peut pas être négatif.");
    }

    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
