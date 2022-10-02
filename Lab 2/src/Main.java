import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //instance of cardinal
        Cardinal cardinal = new Cardinal("Jovanni", 87, "Italy");
        System.out.println(cardinal.getName() + " is a cardinal from " + cardinal.getCountry() + " and is " + cardinal.getAge() + " years old.");

        //instance of Duke
        Duke duke = new Duke("Christian", 65, "Italy");
        System.out.println(duke.getName() + " is a duke from " + duke.getCountry() + " and is " + duke.getAge() + " years old.");

        System.out.println(cardinal.getName() + " declares " + duke.getName() + " a King!");

        King king = cardinal.declareKing(duke.getName(), duke.getAge(), duke.getCountry());

        System.out.println(king.getName() + " is a king from " + king.getCountry() + " and is " + king.getAge() + " years old.");

        //instance of Peasant
        Peasant peasant = new Peasant("John", 25, "Italy");
        System.out.println(peasant.getName() + " is a peasant from " + peasant.getCountry() + " and is " + peasant.getAge() + " years old.");

        king.declareKnight(peasant.getName(), peasant.getAge(), peasant.getCountry());

    }
}