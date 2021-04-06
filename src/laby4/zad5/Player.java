package laby4.zad5;

import javax.naming.Name;
import java.util.Random;

public class Player {

    final private String name;
    final private int minSpeed;
    final private int maxSpeed;
    private int coverdDistance;

    public Player(String name, int minSpeed, int maxSpeed){
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.coverdDistance = 0;
    }

    public void introduceYourself(){
        System.out.println("Jestem " + this.name + " biegam z predkoscia " + minSpeed + "-" + maxSpeed + " km/h");
    }


    public void runForestRun(){
        Random randomDistance = new Random();
        this.coverdDistance += randomDistance.nextInt(this.maxSpeed + 1 - this.minSpeed) + this.minSpeed;
        System.out.println(this.coverdDistance);
    }

    public int getCoverdDistance() {
        return coverdDistance;
    }

    public String getName() {
        return name;
    }
}
