package laby3.zad4;

public enum Kind {
    NOTEBOOK(1),
    DESKTOP(2);

    int value;

    Kind(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
