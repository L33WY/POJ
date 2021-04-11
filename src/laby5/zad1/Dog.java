package laby5.zad1;

public final class Dog extends Animal{


    private static String makeSound(){
        return "Hau Hau";
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + Dog.makeSound();
    }
}
