package laby7.zad3;

public class Main {

    public static void main(String[] args) {
        System.out.println(method(2, "Ala ", "Nie ", "ma ", "test ", "Kota i ", "psa ", "papuge "));
    }

    public static String method(int number, String ... input){
        String text = "";
        for (int i=0; i<= input.length; i+=number){
            text = text + input[i];
        }
        return text;
    }
}
