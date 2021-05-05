package laby8.zad7;

public class Triangle implements Figure{

    private int circuit, filed;

    @Override
    public void countField(int...side) {
        this.filed = (side[0] * side[1]) / 2;
    }

    @Override
    public void countCircuit(int...side) {
        this.circuit = side[0] + side[1] + side[2];
    }

    public int getCircuit() {
        return circuit;
    }

    public int getFiled() {
        return filed;
    }
}
