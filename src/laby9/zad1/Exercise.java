package laby9.zad1;

public class Exercise {


    public static void main(String[] args) throws Throwable {

        MyList <Integer> myList = new MyList<>();

        for (int i=0; i<50; i++){
            myList.add(i);

        }

        myList.showList();
        System.out.println();
        System.out.println(myList.size());

        System.out.println(myList.contains(20));
        System.out.println(myList.contains(14));

        System.out.println(myList.get(20));


    }
}
