package laby2;

import java.util.Arrays;

public class zaddom4 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, -2, -5, 6};
        sumArray(array1);
    }

    static void sumArray(int[] array1){
        int sum = 0;
        for (int i=0; i<array1.length; i++){
            if ((array1[i]) >= 0){
                sum += array1[i];
            }
        }
        System.out.println(sum);
    }
}
