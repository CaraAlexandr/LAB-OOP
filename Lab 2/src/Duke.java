public class Duke {
    private String name;
    private int age;
    private String country;

    public Duke(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String party() {
        return "I'm a Duke and I'm partying!";
    }

    public int takeLand(){
        return (int) (Math.random()*(1000-1+1)+1);
    }

    public int giveLand(){
        return (int) (Math.random()*(1000-1+1)+1);
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
