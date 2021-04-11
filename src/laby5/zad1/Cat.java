package laby5.zad1;

public final class Cat extends Animal{

    private static String makeSound(){
        return "Miau Miau";
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + Cat.makeSound();
    }
}
