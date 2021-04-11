package laby5.zad3;

public final class Truck extends Car{
    private final String loadSpace;

    public Truck(String color, String brand, int m3) {
        super(color, brand);
        this.loadSpace = String.valueOf(m3) + " m3";
    }
}
