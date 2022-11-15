public class Person implements Human {
    private final String name;
    protected int age;
    protected String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
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

    @Override
    public String work() {
        return "Working";
    }

    @Override
    public String sleep() {
        return "Sleeping";
    }

    @Override
    public String eat() {
        return "Eating";
    }

    @Override
    public String drink() {
        return "Drinking";
    }

    @Override
    public String play() {
        return "Playing";
    }

    @Override
    public String talk() {
        return "Talking";
    }
}
