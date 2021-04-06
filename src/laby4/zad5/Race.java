package laby4.zad5;

public class Race {
    private final Player[] playersList;

    public Race(Player[] playersList){
        this.playersList = playersList;
    }

    private boolean stopRace(){
        for (int i=0; i<playersList.length; i++){
            int distance = playersList[i].getCoverdDistance();
            if (distance >= 50){
                System.out.println("Koniec wyscigu, wygral: " + this.playersList[i].getName());
                return true;
            }
        }
    return false;
    }

    public void startRace(){

        while (!stopRace()){
            for (int i=0; i<playersList.length; i++){
                playersList[i].runForestRun();
                playersList[i].introduceYourself();
            }
        }

    }
}
