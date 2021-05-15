package laby9.zad2;

public class Player implements Comparable<Player>{

    private String first_name;
    private String last_name;
    private Integer ranking;
    private Double maxSpeed;

    public Player(String first_name, String last_name, Integer ranking, Double maxSpeed) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.ranking = ranking;
        this.maxSpeed = maxSpeed;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Integer getRanking() {
        return ranking;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Player{" +
                "first_name='" + this.first_name + '\'' +
                ", last_name='" + this.last_name + '\'' +
                ", ranking=" + this.ranking +
                ", maxSpeed=" + this.maxSpeed + '\n' +
                '}';
    }


    @Override
    public int compareTo(Player player) {
        return this.last_name.compareTo(player.getLast_name()) + this.first_name.compareTo(player.getFirst_name()) +
                this.ranking.compareTo(player.getRanking());
    }

}
