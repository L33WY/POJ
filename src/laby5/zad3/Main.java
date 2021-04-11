package laby5.zad3;

public class Main {
    public static void main(String[] args) {

        Cabrio cabrio = new Cabrio("czerwony", "porshe", 2);
        Truck truck = new Truck("bialy", "mercedes", 180);
        Sport sport = new Sport("zielony", "bmw", 320);

        Car[] exhibition = {cabrio, truck, sport};

        for (Car car : exhibition){
            car.introduce();
        }
    }
}
