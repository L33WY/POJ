package laby3.zad1;

public class Lab3Exercise1 {
    public static void main(String[] args) {
        System.out.println("Zadanie pierwsze: ");

        Square kwadrat = new Square(3);
        kwadrat.countField();
        kwadrat.countCircuit();
        System.out.println("Pole to: " + kwadrat.field + " a obwód to: " + kwadrat.ciccuit);
    }
}
