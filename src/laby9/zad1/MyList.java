package laby9.zad1;

import java.util.Objects;

public class MyList <T>{

    private T arr[];
    private int lastItemIdx = 0;


    public MyList() {
        this.arr = (T[]) new Objects[20];
    }

    public boolean add(T element){
        if (this.lastItemIdx + 1 < 20){
            arr [this.lastItemIdx] = element;
            lastItemIdx += 1;
            return true;
        }else{
            return false;
        }
    }
}
