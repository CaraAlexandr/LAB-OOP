package Model;

import Model.Plebeian;

public class Knight extends Plebeian {

    public Knight(String name, int age, String country) {
        super(name, age, country);
    }

    public void fightForKingdom() {
        System.out.println(getName()+" is fighting for the kingdom");
    }

    public void train() {
        System.out.println(getName() + " is training");
    }

}
