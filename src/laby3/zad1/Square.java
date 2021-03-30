package laby3.zad1;

public class Square {
    int field;
    int side;
    int ciccuit;

    public Square(int side){
        this.side = side;
    }

    public void countField() {
        this.field = this.side * this.side;
    }

    public void countCircuit() {
        this.ciccuit = 4 * this.side;
    }

}
