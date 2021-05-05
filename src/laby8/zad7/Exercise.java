package laby8.zad7;

public class Exercise {

    public static void main(String[] args) {


        Square square = new Square();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        square.countField(5);
        square.countCircuit(5);

        System.out.println(square.getFiled());
        System.out.println(square.getCircuit());

        rectangle.countField(5, 2);
        rectangle.countCircuit(5, 2);

        System.out.println(rectangle.getFiled());
        System.out.println(rectangle.getCircuit());

        triangle.countField(6, 4);
        triangle.countCircuit(6, 3, 2);

        System.out.println(triangle.getFiled());
        System.out.println(triangle.getCircuit());
    }
}
