package laby3.zad3;

public class Lab3Exercise3 {
    public static void main(String[] args) {

        Tv samsung = new Tv();
        Remote samsungRemote = new Remote(samsung);

        System.out.println("funkcja on/off w pilocie");
        System.out.println(samsung.state);
        samsungRemote.changeState();
        System.out.println(samsung.state);

        System.out.println("funkcje góra/dół kanał");
        samsungRemote.channelDown();
        System.out.println(samsung.channel);
        samsungRemote.channelDown();
        System.out.println(samsung.channel);
        samsungRemote.channelUp();
        System.out.println(samsung.channel);

        System.out.println("funkcje głośniej/ciszej");
        samsungRemote.volumeUp();
        System.out.println(samsung.volume);
        samsungRemote.volumeUp();
        System.out.println(samsung.volume);
        samsungRemote.volumeDown();
        System.out.println(samsung.volume);
    }
}
