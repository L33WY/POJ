package laby3.zad3;

import java.util.Scanner;

public class Remote {

    Tv tv;

    public Remote(Tv device){
        this.tv = device;
    }

    public void changeState(){
        if (!tv.state){
            tv.state = true;
        }else{
            tv.state = false;
        }
    }
    public void channelUp(){
        tv.channel += 1;
        if (tv.channel == 21){
            tv.channel = 1;
        }
    }
    public void channelDown(){
        tv.channel -= 1;
        if (tv.channel == 0){
            tv.channel = 20;
        }
    }
    public void volumeUp(){
        if (tv.volume == 10){
            System.out.println("Max volume already");
        }else {
            tv.volume += 1;
        }
    }
    public void volumeDown(){
        if (tv.volume == 1){
            System.out.println("Min volume already");
        }else {
            tv.volume -= 1;
        }
    }

}
