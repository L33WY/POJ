package laby2;

import java.util.Arrays;
import java.util.Scanner;

public class zaddom1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tabeli: ");
        int arrayLength = scanner.nextInt();
        int[] array1 = new int[arrayLength];

        for (int i=0; i<array1.length; i++){
            int element = i+1;
            System.out.println("Podaj "+ element + " element tablicy");
            array1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array1));

    }
}
