package laby1;

import java.time.Month;
import java.util.Scanner;

public class zaddom3 {

    public static void main(String[] args) {

        int month_num;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbe odpowiadajaca misiacowi(1-12): ");
            month_num = scanner.nextInt();

        } while ((month_num > 12) || (month_num < 1));

        System.out.println(Month.of(month_num));
    }
}
