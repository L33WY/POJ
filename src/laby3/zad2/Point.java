package laby3.zad2;

public class Point {

    int x;
    int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void countDistance(int x, int y, Point point){
        double distance = Math.sqrt(Math.pow((point.x - x),2) + Math.pow((point.y - y), 2));
        System.out.println(distance);
    }
}
