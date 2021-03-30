package laby3.zad4;

public class Pc {

    public static void main(String[] args) {
        Pc komputer = new Pc(Kind.NOTEBOOK, PcSystem.LINUX, true, 2);

        komputer.info(komputer);
    }

    Kind kind;
    PcSystem pcSystem;
    boolean state;
    int cores;

    public Pc(Kind kind, PcSystem pcSystem, boolean state, int cores){
        this.kind = kind;
        this.pcSystem = pcSystem;
        this.state = state;
        this.cores = cores;
    }

    public void info(Pc computer){
        System.out.println("wartość: " + computer.kind.value + " system: " + computer.pcSystem.version + " stan: "
                + computer.state + " kory: " + computer.cores);
    }
}
