package org.example.Prosit2;


public class Zoo {
    Animal[] animals = new Animal[25];
    public String name;
    public String city;
    public int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages +
                ", animals=" + java.util.Arrays.toString(animals) + "}";
    }

}
