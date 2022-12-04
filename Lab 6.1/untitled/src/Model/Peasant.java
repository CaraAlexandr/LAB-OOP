package Model;

public class Peasant extends Plebeian {

    public Peasant(String name, int age, String country,boolean status) {
        super(name, age, country);
    }

    public String work() {
        return getName() + "is working!";
    }

    public String sleep() {
        return getName() + "is sleeping!";
    }
}
