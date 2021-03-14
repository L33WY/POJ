package laby1;

import java.util.Arrays;
import java.util.Scanner;

public class zaddom4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        int first_num = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int second_num = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe: ");
        int third_num = scanner.nextInt();

        int[] numbers = {first_num, second_num, third_num};
        Arrays.sort(numbers);

        for (int i=2; i>=0; i--){
            System.out.println(numbers[i]);
        }

    }
}
