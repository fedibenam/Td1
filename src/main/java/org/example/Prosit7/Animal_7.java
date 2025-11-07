// java
package org.example.Prosit7;

public class Animal_7 {
    private final String family;
    private final String name;
    private final int age;
    private final boolean isMammal;

    public Animal_7(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() { return family; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isMammal() { return isMammal; }

    @Override
    public String toString() {
        return "Animal{family='" + family + "', name='" + name + "', age=" + age + ", isMammal=" + isMammal + "}";
    }
}
