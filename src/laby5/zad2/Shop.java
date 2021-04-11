package laby5.zad2;

public class Shop {
    private final String adres;
    private final int size;

    public Shop(String adres, int size) {
        this.adres = adres;
        this.size = size;
    }

    protected String getInformation(){
        return this.adres + " | " + this.size;
    }
}
