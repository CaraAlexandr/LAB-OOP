public class Executor {
    private String name;
    private int age;
    private String country;

    public Executor(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String chopHead(String newName) {
        return "Chopped"+ newName +"head";
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
