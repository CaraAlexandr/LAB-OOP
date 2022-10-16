public class Judge extends Nobility {

    public Judge(String name,String familyName, int age, String country) {
        super(name, familyName, age, country);
    }

    public void accuse(String newName) {
        if(Math.random() > 0.5) {
            System.out.println(newName + " is guilty!");
        } else {
            System.out.println(newName + " is innocent!");
        }
    }
}

