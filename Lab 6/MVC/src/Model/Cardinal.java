package Model;

import Model.Nobility;

public class Cardinal extends Nobility {


    public Cardinal(String name,String familyName, int age, String country) {
        super(name,familyName, age, country);
    }

    public String giveBlessing() {
        return "May God bless you!";
    }

    public King declareKing(String newName, String newFamilyName, int newAge, String newCountry) {

        System.out.println("I declare " + newName + " "+newFamilyName+ "as the new king of " + newCountry + "!");
        King king = new King(newName,newFamilyName, newAge, newCountry);
        return king ;
    }

    public String askGodForHelp() {
        if(Math.random() > 0.5) {
            return "God said, Yes!";
        } else {
            return "God, said, No!";
        }
    }

}
