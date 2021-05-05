package laby8.zad7;

public class Square implements Figure{

    private int circuit, filed;

    @Override
    public void countField(int...side) {
        this.filed = side[0] * side[0];
    }

    @Override
    public void countCircuit(int...side) {
        this.circuit = side[0] * 4;
    }

    public int getCircuit() {
        return circuit;
    }

    public int getFiled() {
        return filed;
    }
}
