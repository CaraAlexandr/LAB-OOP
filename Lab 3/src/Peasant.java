public class Peasant {
    private String name;
    private int age;
    private String country;

    public Peasant(String name, int age, String country,boolean status) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String work() {
        return getName() + "is working!";
    }

    public String sleep() {
        return getName() + "is sleeping!";
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
