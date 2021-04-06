package laby4.zad5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Player zawodnik1 = new Player("Julek", 3, 13);
        Player zawodnik2 = new Player("Tomek", 4, 15);
        Player zawodnik3 = new Player("Bolt", 7, 10);
        Player zawodnik4 = new Player("Dawid", 6, 14);

        Player[] playersList = {zawodnik1, zawodnik2, zawodnik3, zawodnik4};

        Race tourTheFrance = new Race(playersList);
        tourTheFrance.startRace();
    }
}
