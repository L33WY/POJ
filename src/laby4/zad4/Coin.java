package laby4.zad4;

public enum Coin {
    HEADS("orzel"),
    TAILS("reszka");

    String value;

    Coin(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
