package laby1;


public class zaddom1 {

    private static final double K = 273.15;

    public static void main(String[] args) {


        System.out.println("Celsjus" + "\t" + "Kelvin");

        for (int c=1;c<=10; c++){


            System.out.println(c + "\t" + (K+c) );
        }
    }
}
