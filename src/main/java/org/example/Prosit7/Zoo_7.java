// java
package org.example.Prosit7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo_7 {
    public static final int NBR_CAGES = 25;

    private final String name;
    private final String city;
    private static int maxCages = 0;
    private static final List<Animal_7> animals = new ArrayList<>();

    public Zoo_7(String name, String city) {
        this(name, city, NBR_CAGES);
    }

    public Zoo_7(String name, String city, int maxCages) {
        this.name = name;
        this.city = city;
        this.maxCages = maxCages;
    }

    // Validate age first, then capacity; throw specific exceptions
    public static void addAnimal(Animal_7 animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }
        if (animals.size() >= maxCages) {
            throw new ZooFullException("Cannot add animal: zoo is full (max " + maxCages + " animals).");
        }
        animals.add(animal);
    }

    public boolean removeAnimal(Animal_7 animal) {
        return animals.remove(animal);
    }

    public List<Animal_7> getAnimals() {
        return Collections.unmodifiableList(animals);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + maxCages + ", animals=" + animals + "}";
    }
}
