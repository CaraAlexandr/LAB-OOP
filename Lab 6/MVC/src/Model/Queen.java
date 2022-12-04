package Model;

public class Queen extends Nobility {
    public Queen(String name, String familyName, int age, String country) {
        super(name, familyName, age, country);
    }

    public boolean giveBirth() {
        if (Math.random() > 0.5) {
            System.out.println("Its a boy!");
            return true;
        } else {
            System.out.println("Its a girl!");
            return false;
        }
    }
}