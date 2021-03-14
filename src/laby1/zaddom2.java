package laby1;


import java.util.Scanner;

public class zaddom2 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe studentów: ");
        Scanner scanner = new Scanner(System.in);
        int students_number = scanner.nextInt();
        scanner.nextLine();

        int bestscore = 0;
        String bestname = "";

        for (int i=1; i<=students_number;i++){

            System.out.println("Podaj imie: ");
            String name = scanner.nextLine();

            System.out.println("Podaj liczbe punktow: ");
            int score = scanner.nextInt();
            scanner.nextLine();


            if (score > bestscore){
                bestscore = score;
                bestname = name;
            }

            if (students_number == i){
                System.out.println("Najlepszy student to: " + bestname + "a jego wynik to: " + bestscore);
            }
        }

    }
}
