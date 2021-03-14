package laby1;

import java.util.Scanner;

public class zaddom5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Papier-0, Nozyczki-1, Kamien-2");

        int pc_figure = (int) (Math.random()*3);

        System.out.println("Wybierz swoaja figure(1-3)");
        int user_figure = scanner.nextInt();

        System.out.println("Pc mial: " + pc_figure);
        if (pc_figure==user_figure){
            System.out.println("remis");
        }
        else if (((pc_figure==0) && (user_figure==2)) || ((pc_figure==1) && (user_figure==0)) || (pc_figure==2) && (user_figure==1) ){
            System.out.println("Wygrał PC");
        }
        else {
            System.out.println("Wygral user");
        }
    }
}
