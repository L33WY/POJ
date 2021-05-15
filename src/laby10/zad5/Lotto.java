package laby10.zad5;

import java.util.*;

public class Lotto {

    public static void main(String[] args) {
        Lotto lottoGame = new Lotto();
        lottoGame.startGame();
    }

    private Set <Integer> numberRange = new HashSet<>();
    private List <Integer> userNumbers = new ArrayList<>();

    public Lotto() {
        for (int i=1; i<=49; i++){
            this.numberRange.add(i);
        }
    }
    public void startGame(){
        this.userNumbers.clear();
        int correctInput = 0;

        do {
            System.out.println("Podaj liczbe od 1 do 49 !");
            Scanner scan = new Scanner(System.in);
            Integer input = scan.nextInt();
            if (this.numberRange.contains(input)){
                this.userNumbers.add(input);
                correctInput ++;
            }else {
                System.out.println("liczba musi byc z zakresu od 1 do 49 !");
            }

        }while (correctInput < 6);

        Set <Integer> pcNumbers = new HashSet<>();
        Random random = new Random();
        do {
            pcNumbers.add(random.nextInt(49));
        }while (pcNumbers.size() < 6);

        Iterator <Integer> element = pcNumbers.iterator();

        int correctNumbers = 0;
        do {
            if (this.userNumbers.contains(element.next())){
                correctNumbers ++;
            }
        }while ((element.hasNext()));

        System.out.println("Twoje liczby to: " + this.userNumbers.toString());
        System.out.println("PC liczby to: " + pcNumbers.toString());
        System.out.println("Liczba trafien to: " + correctNumbers);

        pcNumbers.clear();
    }
}
