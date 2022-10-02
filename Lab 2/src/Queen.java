public class Queen {
    private String name;
    private int age;
    private String country;

    public Queen(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public boolean giveBirth() {
        if(Math.random() > 0.5) {
            System.out.println("Its a boy!");
            return true;
        } else {
            System.out.println("Its a girl!");
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
