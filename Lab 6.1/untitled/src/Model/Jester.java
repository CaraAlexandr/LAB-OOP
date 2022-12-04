package Model;

import Model.Plebeian;

import java.util.Random;

public class Jester extends Plebeian {

    public Jester(String name, int age, String country) {
        super(name, age, country);
    }

    public int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public String tellJoke(){
        switch (randomInt(1, 4)) {
            case 1:
                return "What do you call a cow with no legs? Ground beef.";
            case 2:
                return "What do you call a cow with two legs? Lean beef.";
            case 3:
                return "What do you call a cow with three legs? Tri-tip.";
            case 4:
                return "What do you call a cow with four legs? Steak.";
            default:
                return "What do you call a cow with no legs? Ground beef.";
        }

        }
}
