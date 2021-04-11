package laby5.zad7;

public class Main {
    public static void main(String[] args) {

    Human human = new Human("Jan", 25);
    SuperHuman superHuman = new SuperHuman("Jan", 25, "latanie");


        System.out.println(human == superHuman);
        System.out.println(human.hashCode() == superHuman.hashCode());
        System.out.println(human.equals(superHuman));
        System.out.println(superHuman.equals(human));
    }
}
