public class Judge extends Nobility {

    public Judge(String name,String familyName, int age, String country) {
        super(name, familyName, age, country);
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
}

