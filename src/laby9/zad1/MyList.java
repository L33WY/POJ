package laby9.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyList <T> {

    private T arr[];
    private int lastItemIdx;
    private Object IndexOutOfBoundsException;


    public MyList() {
        this.arr = (T[]) new Object[20];
        this.lastItemIdx = 0;
    }

    private void extendMyList() throws Throwable {
        int tempLastItemIdx = this.lastItemIdx * 2;
        T tempList[] = (T[]) new Object[tempLastItemIdx];
        for (int i=0; i<this.lastItemIdx; i++){
            tempList[i] = this.get(i);
        }
        this.lastItemIdx = tempLastItemIdx;
        arr = tempList;
    }

    public boolean add(T element) throws Throwable {
        if (this.lastItemIdx < 20){
            arr [this.lastItemIdx] = element;
            lastItemIdx += 1;
            return true;
        }else{
            this.extendMyList();
            return true;
        }
    }

    public int size(){
        return this.lastItemIdx ;
    }

    public void showList(){
        for (T element : this.arr){
            System.out.print(element + ",");
        }
    }

    public boolean contains(T element){
        for (T record : this.arr){
            if (record == element){
                return true;
            }
        }
        return false;
    }

    public int indexOf(T element){

        int indexOfElement = -1;
        for (T record : this.arr){
            indexOfElement ++;
            if (record == element) {
                return indexOfElement;
            }
        }
        System.out.println("Nie ma takiego elementu");
        return -1;
    }

    public int lastIndexOf(T element){
        int indexOfElement = -1;
        int indexOfLastElement = -1;
        for (T record : this.arr){
            indexOfElement ++;
            if (record == element) {
                indexOfLastElement = indexOfElement;
            }
            return indexOfLastElement;
        }
        System.out.println("Nie ma takiego elementu");
        return -1;
    }

    public T get(int index) throws Throwable {
        int indexOfElement = 0;
        if (index < 0 || index > this.lastItemIdx){
            throw (Throwable) IndexOutOfBoundsException;
        }
        try {
            for (T record : this.arr) {
                indexOfElement ++;
                if (indexOfElement == index){
                    return record;
                }
            }
        } catch (IndexOutOfBoundsException e){ }
        return arr[-1];
    }

    public void set(int index, T element){
        try {
            this.arr[index] = element;
        } catch (IndexOutOfBoundsException e){};
    }



}
