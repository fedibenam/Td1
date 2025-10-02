package org.example.Prosit3;

public class Animal_3 {
    public String family;
    public String name;
    public int age;
    public boolean isMammal;

    public Animal_3(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {

        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }



}
