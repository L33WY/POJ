package laby4.zad4;

public class Symulation {
    final private int trails;
    private int numHeads;
    private int numTails;

    public Symulation(int trails){
        this.trails = trails;
    }

    public void  symulationOn(){
        for (int i=1; i<=this.trails; i++){
            int randomNumber = (int)(Math.random()*2);

            if (randomNumber == 0){
                this.numHeads += 1;
            }else{
                this.numTails += 1;
            }
        }
    }

    public void showResult(){

        double percentHeads = ((double) this.numHeads / this.trails) * 100.0;
        double percentTails = ((double) this.numTails / this.trails) * 100.0;

        System.out.println(Coin.HEADS.value + " wypadł w: " + percentHeads + "%");
        System.out.println(Coin.TAILS.value + " wypadła w: " + percentTails + "%");

    }

}
