import java.util.Random;

public class Jester {
    private String name;
    private int age;
    private String country;

    public Jester(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public String tellJoke(){
        switch (randomInt(1, 4)) {
            case 1:
                return "What do you call a cow with no legs? Ground beef.";
            case 2:
                return "What do you call a cow with two legs? Lean beef.";
            case 3:
                return "What do you call a cow with three legs? Tri-tip.";
            case 4:
                return "What do you call a cow with four legs? Steak.";
            default:
                return "What do you call a cow with no legs? Ground beef.";
        }

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
