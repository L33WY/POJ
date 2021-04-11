package laby5.zad2;

public final class BookShop extends Shop{
    private String[] products;

    public BookShop(String adres, int size, String[] products) {
        super(adres, size);
        this.products = products;
    }

    @Override
    protected String getInformation() {
        String allProducts = "Produkty: ";
        for (String product: this.products){
            allProducts += product + ", ";
        }
        return super.getInformation() + " | " + allProducts;
    }
}
