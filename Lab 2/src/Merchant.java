public class Merchant {
    private String name;
    private int age;
    private String country;

    public Merchant(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void getStock(String stock[]){
        System.out.println("Stock: " + stock);
    }

    public String showStock(String stock[]){
        return "Stock: " + stock;
    }

    public String sell(String stock){
        return "Sold " + stock;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
