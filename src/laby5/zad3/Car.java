package laby5.zad3;

public class Car {
    private String color;
    private final String brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    protected void introduce(){
        System.out.println(this.brand + ", " + this.color);
    }
}
