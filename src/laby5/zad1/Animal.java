package laby5.zad1;

public class Animal {
    private final String name;
    private final String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.name + " | " + this.color;
    }
}
