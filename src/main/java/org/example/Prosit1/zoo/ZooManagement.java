package org.example.Prosit1.zoo;

import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public ZooManagement() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" name of the zoo:");
            zooName = scanner.nextLine();
        } while (zooName.isEmpty());
        do {
            System.out.println(" number of cages:");
            while (!scanner.hasNextInt()) {
                System.out.println("write number ");
                scanner.next();
            }
            nbrCages = scanner.nextInt();
        } while (nbrCages <= 0);
        System.out.println("This is " + zooName + " with " + nbrCages + " cages.");
    }
}
