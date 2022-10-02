public class Judge {
    private String name;
    private int age;
    private String country;

    public Judge(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public boolean accuse() {
        if(Math.random() > 0.5) {
            System.out.println("Guilty!");
            return true;
        } else {
            System.out.println("Not guilty!");
            return false;
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

