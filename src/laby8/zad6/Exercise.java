package laby8.zad6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd 'Godzina:' HH-mm");
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        String country = null;
        String [] countries = {"USA", "China", "Australia"};
        do{
            try{
                System.out.println("Podaj Kraj dla którego chcesz spradzwic czas(USA, China, Australia): ");
                Scanner scan = new Scanner(System.in);
                country = scan.nextLine();
            } catch (Exception e){
                System.out.println("Podaj poprawny kraj (USA, China, Australia)");
            }
            
        }while (!(Arrays.asList(countries).contains(country)));


        LocalDateTime diffrentCountry;
        String diffrentCountryToDisplay, currentToDisplay;

        switch (country){
            case "USA":
                diffrentCountry = current.plusHours(6);
                currentToDisplay = current.format(format);
                System.out.println("Aktualna data oraz czas w Polse: " + currentToDisplay);
                diffrentCountryToDisplay = diffrentCountry.format(format);
                System.out.println("Aktualna data oraz czas w USA: " + diffrentCountryToDisplay);
                break;
            case "China":
                diffrentCountry = current.plusHours(8);
                currentToDisplay = current.format(format);
                System.out.println("Aktualna data oraz czas w Polse: " + currentToDisplay);
                diffrentCountryToDisplay = diffrentCountry.format(format);
                System.out.println("Aktualna data oraz czas w Chinach: " + diffrentCountryToDisplay);
                break;
            case "Australia":
                diffrentCountry = current.plusHours(10);
                currentToDisplay = current.format(format);
                System.out.println("Aktualna data oraz czas w Polse: " + currentToDisplay);
                diffrentCountryToDisplay = diffrentCountry.format(format);
                System.out.println("Aktualna data oraz czas w Australii: " + diffrentCountryToDisplay);
                break;

        }
    }
}
