package laby5.zad2;

public class Main {
    public static void main(String[] args) {

        String products[] = {"Bagiety", "Kajzerki", "Pieczywo"};
        String books[] = {"Chlopi", "Dziady", "Czysty kod"};
        Bakery piekarnia = new Bakery("221B Baker Street", 60, products);
        BookShop empik = new BookShop("Wyzwolenia 15c", 120, books);

        System.out.println(piekarnia.getInformation());
        System.out.println(empik.getInformation());
    }
}
