package Model;

public class Nobility extends Person {
    private String familyName;
    private int familyWealth;

    public Nobility(String name, String familyName, int age, String country) {
        super(name, age, country);
        this.familyName = familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyWealth(int familyWealth) {
        this.familyWealth = familyWealth;
    }

    public int getFamilyWealth() {
        return familyWealth;
    }
}

