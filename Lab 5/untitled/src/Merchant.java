public class Merchant extends Plebeian {
    public Merchant(String name, int age, String country) {
        super(name, age, country);
    }

    public void getStock(String[] stock){
        System.out.println("Stock: " + stock);
    }

    public String showStock(String[] stock){
        return "Stock: " + stock;
    }

    public String sell(String stock){
        return "Sold " + stock;
    }
}
