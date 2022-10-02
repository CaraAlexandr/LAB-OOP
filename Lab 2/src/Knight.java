public class Knight {
    private String name;
    private int age;
    private String country;

    public Knight(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String fightForKingdom() {
        return "I am fighting for the kingdom!";
    }

    public String train() {
        return "I am training!";
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
