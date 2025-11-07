package org.example.Prosit7;

public class ZooFullException extends Exception {
    public ZooFullException() {
        super("Le zoo est plein, impossible d\\'ajouter un nouvel animal.");
    }

    public ZooFullException(String message) {
        super(message);
    }

    public ZooFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
