package laby2;

public class zaddom3 {
    public static void main(String[] args) {

        int[][] array1 = {
                {1,1},
                {1,2},
                {2,2}
        };
        int[][] array2 = {
                {1,1},
                {1,2}
        };


        System.out.println(sumDuoMatrix(array1, array2));

    }

    static int sumDuoMatrix(int[][] array1, int[][] array2){
        int sum = 0;
        for (int i=0; i<array1.length;i++){
            for (int j=0; j<array1[i].length; j++){
                sum = sum + array1[i][j];
            }
        }

        for (int i=0; i<array2.length;i++){
            for (int j=0; j<array2[i].length; j++){
                sum = sum + array2[i][j];
            }
        }

        return sum;
    }
}
