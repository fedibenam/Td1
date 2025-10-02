package org.example.Prosit3;

import org.example.Prosit2.Animal;

public class Zoo_3 {
    private static final int NBR_CAGES = 25;
    Animal[] animals = new Animal[25];
    public String name;
    public String city;
    public int nbrCages;
    private int animalCount = 0;

    public Zoo_3(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
    }

    public boolean addAnimal(Animal a) {
        if (animalCount >= animals.length) {
            return false; // Zoo is full
        }
        if (findAnimalByName(a.name) != -1) {
            return false; // Animal already exists
        }
        animals[animalCount] = a;
        animalCount++;
        return true;
    }


    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int findAnimalByName(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimalByName(String name) {
        int index = findAnimalByName(name);
        if (index == -1) {
            return false; // Animal not found
        }
        // Shift animals left to fill the gap
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null; // Remove reference
        animalCount--;
        return true;
    }

    // src/main/java/org/example/Prosit3/Zoo_3.java
    public boolean isFull() {
        return animalCount >= NBR_CAGES;
    }

    public static Zoo_3 compareZoo(Zoo_3 z1, Zoo_3 z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }




    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages +
                ", animals=" + java.util.Arrays.toString(animals) + "}";
    }
}
