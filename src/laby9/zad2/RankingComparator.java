package laby9.zad2;

import java.util.Comparator;

public class RankingComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return player1.getRanking().compareTo(player2.getRanking());
    }
}
