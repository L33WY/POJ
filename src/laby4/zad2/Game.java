package laby4.zad2;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private final int numRange;

    public Game(int numRange) {
        this.numRange = numRange;
    }

    public void gameOn(){

        int pcNum = (int)Math.floor(Math.random()*(this.numRange+1)+1);

        for (int i=5; i>0; i--){
            Scanner scan = new Scanner(System.in);
            System.out.println("Pozostało ci " + i + " prob");
            System.out.println("Zgadnij o jakiej liczbie od 1 do " + this.numRange + " mysli pc: ");
            int userGuess = scan.nextInt();

            if (userGuess == pcNum){
                System.out.println("Gratulacje wygrałeś!");
                return;
            }if (userGuess < pcNum){
                System.out.println("Za mało!");
            }else {
                System.out.println("Za dużo!");
            }
        }
        System.out.println("Przegrales, nr o ktorym myslal pc to: " + pcNum);
    }


}
