package laby2;

import java.util.Arrays;

public class zaddom2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{4, 5, 6, 7};
        System.out.println(Arrays.toString(arrayEx2(array1, array2)));
    }

    static int[] arrayEx2(int[] array1, int[] array2) {
        int[] sumArray = new int[array1.length];
        if (array1.length != array2.length) {
        }
        else {
            for (int i=0; i<array1.length; i++){
                sumArray[i] = array1[i] + array2[i];
            }
        }
        return sumArray;
    }
}