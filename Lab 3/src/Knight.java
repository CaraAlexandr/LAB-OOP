public class Knight extends Plebeian {
    private String name;
    private int age;
    private String country;

    public Knight(String name, int age, String country) {
        super(name, age, country);
    }

    public String fightForKingdom() {
        return "I am fighting for the kingdom!";
    }

    public String train() {
        return "I am training!";
    }

}
