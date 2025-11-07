package org.example;

import org.example.Prosit2.Animal;
import org.example.Prosit2.Zoo;
import org.example.Prosit1.zoo.ZooManagement;
import org.example.Prosit3.Animal_3;
import org.example.Prosit3.Zoo_3;
import org.example.Prosit7.Animal_7;
import org.example.Prosit7.InvalidAgeException;
import org.example.Prosit7.ZooFullException;
import org.example.Prosit7.Zoo_7;

public class Main {
    public static void main(String[] args) {
        /* Prosit 1*/

        ZooManagement zooManagement = new ZooManagement();

        /*Prosit 2

        //before construtor

        Animal lion = new Animal();
        lion.family = "Félins";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "MyZoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 20;

        //After Constructor

        Animal dragon = new Animal("Felidae", "Lion", 5, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);
        Animal eagle = new Animal("Accipitridae", "Eagle", 3,false);

        Zoo prositzoo = new Zoo("Safari Park", "Tunis", 10);

        System.out.println(crocodile.toString());
        System.out.println(crocodile);

        */

        /*Prosit 3

        Zoo_3 myZoo = new Zoo_3("Safari Park", "Paris", 25);

        for (int i = 0; i < 27; i++) {
            Animal a = new Animal("Family" + i, "Name" + i, i, false);
            boolean added = myZoo.addAnimal(a);
            System.out.println("Adding animal " + i + ": " + added);
        }

        System.out.println(myZoo);

        myZoo.displayAnimals();

        Animal a1 = new Animal("Felidae", "Lion", 5, true);
        myZoo.addAnimal(a1);

        int index1 = myZoo.findAnimalByName("Lion");
        System.out.println("Index of Lion: " + index1);

        Animal a2 = new Animal("Felidae", "Lion", 5, true);
        int index2 = myZoo.findAnimalByName("Lion");
        System.out.println("Index of identical Lion: " + index2);


        myZoo.addAnimal(new Animal("Felidae", "Lion", 5, true));
        myZoo.addAnimal(new Animal("Canidae", "Wolf", 3, false));
        myZoo.addAnimal(new Animal("Ursidae", "Bear", 7, false));

        System.out.println("Before removal:");
        myZoo.displayAnimals();

        boolean removed = myZoo.removeAnimalByName("Wolf");
        System.out.println("Removed Wolf: " + removed);

        System.out.println("After removal:");
        myZoo.displayAnimals();

        Zoo_3 zooA = new Zoo_3("Zoo A", "Paris", 25);
        Zoo_3 zooB = new Zoo_3("Zoo B", "Lyon", 25);

        Zoo_3 biggerZoo = Zoo_3.compareZoo(zooA, zooB);
        System.out.println("Zoo with more animals: " + biggerZoo.name);

        */
        /* Prosit 7: */
        Zoo_7 zoo = new Zoo_7("Mini Zoo", "Paris", 3); // small capacity for testing

        // 1) valid animal
        Animal_7 valid = new Animal_7("FamilyValid", "NameValid", 2, false);
        try {
            Zoo_7.addAnimal(valid);
            System.out.println("Adding valid animal: success");
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println("Adding valid animal: failed - " + e.getMessage());
        }
        System.out.println("Total animals after valid attempt: " + zoo.getAnimals().size());

        // 2) invalid age
        Animal_7 invalid = new Animal_7("FamilyInvalid", "NameInvalid", -1, false);
        try {
            Zoo_7.addAnimal(invalid);
            System.out.println("Adding invalid-age animal: success");
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println("Adding invalid-age animal: failed - " + e.getMessage());
        }
        System.out.println("Total animals after invalid-age attempt: " + zoo.getAnimals().size());

        // 3) add multiple animals until capacity is reached
        for (int i = 0; i < 5; i++) {
            Animal_7 a = new Animal_7("Family" + i, "Name" + i, i, false);
            try {
                Zoo_7.addAnimal(a);
                System.out.println("Adding animal " + i + ": success");
            } catch (InvalidAgeException | ZooFullException e) {
                System.out.println("Adding animal " + i + ": failed - " + e.getMessage());
            }
            System.out.println("Total animals after attempt " + i + ": " + zoo.getAnimals().size());
        }

        System.out.println("Final zoo: " + zoo);
    }
}


