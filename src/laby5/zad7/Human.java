package laby5.zad7;

public class Human {
    private final String name;
    private int age;
    private final static String power = "None";

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPower(){
        return this.power;
    }

    @Override
    public String toString() {
        return this.name + this.age;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
