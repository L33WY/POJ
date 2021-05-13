package laby9.zad2;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {


        Player gracz1 = new Player("Dawid", "Lewandowski", 3, 20.5);
        Player gracz2 = new Player("Mateusz", "Andrzejczyk", 4, 22.5);
        Player gracz3 = new Player("Robert", "Lewandowski", 1, 30.5);
        Player gracz4 = new Player("Artur", "Wisniewski", 2, 18.5);

        Player [] players = {gracz1, gracz2, gracz3, gracz4};

        System.out.println(Arrays.toString(players));

        Arrays.sort(players);

        System.out.println(Arrays.toString(players));

        Arrays.sort(players, new RankingComparator());

        System.out.println(Arrays.toString(players));
    }

//    public static Object findMax(Object [] objects){
//        Object maxObject = objects[0];
//        for (Object object : objects){
//
//        }
//    }
}
